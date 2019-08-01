package com.xiayu.module.user.service.iocdemo;

import jodd.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Security;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname DefaultBeanFactory
 * @Description
 * @Author hello
 * @Date 2019/8/1 11:44
 * @Version 1.0
 **/
public class DefaultBeanFactory implements BeanFactory,BeanDefinitionRegistry, Closeable {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);
    private Map<String,Object> beanMap = new ConcurrentHashMap<>(256);


    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) throws Exception {
        Objects.requireNonNull(beanName,"注册bean需要输入beanname");
        Objects.requireNonNull(beanDefinition,"注册bean需要输入beanDefinition");
        if (!beanDefinition.validate()){
            throw new Exception("beanName=" + beanName + "出现错误");
        }
        if (this.containsBeanDefinition(beanName)){
            throw new Exception("beanName=" + beanName +"已经存在");
        }
        this.beanDefinitionMap.put(beanName,beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) {
        return this.beanDefinitionMap.get(beanName);
    }

    @Override
    public Boolean containsBeanDefinition(String beanName) {
        return this.beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public Object getBean(String name) throws Exception {
        return this.doGetBean(name);
    }

    protected Object doGetBean(String beanName) throws Exception{
        Objects.requireNonNull(beanName,"beanName不能为空");
        Object instance = beanMap.get(beanName);
        if (instance != null){
            return instance;
        }
        BeanDefinition beanDefinition = this.getBeanDefinition(beanName);
        Objects.requireNonNull(beanDefinition,"beanDefinition不能为null");
        Class<?> type = beanDefinition.getBeanClass();
        if (type != null){
            if (StringUtil.isBlank(beanDefinition.getFactoryMethodName())){
                instance = this.createInstanceByConstructor(beanDefinition);
            }else {
                instance = this.createInstanceByStaticFactoryMethod(beanDefinition);
            }
        }else {
            instance = this.createInstanceByFactoryBean(beanDefinition);
        }

        this.doInit(beanDefinition,instance);

        if (beanDefinition.isSingleton()){
            beanMap.put(beanName,instance);
        }

        return instance;
    }

    //构造方法来创建对象
    private Object createInstanceByConstructor(BeanDefinition beanDefinition) throws IllegalAccessException, InstantiationException {
        try{
            return beanDefinition.getBeanClass().newInstance();
        } catch (SecurityException e){
            logger.error("创建bean的实例异常,beanDefinition"+beanDefinition,e);
            throw e;
        }
    }

    private Object createInstanceByConstructor1(BeanDefinition beanDefinition) throws IllegalAccessException,InstantiationException{
        try{
            return beanDefinition.getBeanClass().newInstance();
        }catch (SecurityException e){
            logger.error("创建Bean的实例异常，beanDefinition" + beanDefinition,e);
            throw e;
        }
    }

    //静态工厂方法(暂时不考虑带参数)
    private Object createInstanceByStaticFactoryMethod(BeanDefinition beanDefinition) throws Exception{
        Class<?> type = beanDefinition.getBeanClass();
        Method method = type.getMethod(beanDefinition.getFactoryMethodName(),null);
        return method.invoke(type,null);
    }

    private Object createInstanceByStaticFactoryMethod1(BeanDefinition beanDefinition) throws Exception{
        Class<?> type = beanDefinition.getBeanClass();
        Method method = type.getMethod(beanDefinition.getFactoryMethodName(),null);
        return method.invoke(type,null);
    }

    //工厂bean方法来创建对象(暂时不考虑带参数)
    private Object createInstanceByFactoryBean(BeanDefinition beanDefinition) throws Exception{
        Object factoryBean = this.doGetBean(beanDefinition.getFactoryBeanName());
        Method method = factoryBean.getClass().getMethod(beanDefinition.getFactoryMethodName(),null);
        return method.invoke(factoryBean,null);
    }

    private Object createInstanceByFactoryBean1(BeanDefinition beanDefinition) throws Exception{
        Object factoryBean = this.doGetBean(beanDefinition.getFactoryBeanName());
        Method method = factoryBean.getClass().getMethod(beanDefinition.getFactoryMethodName(),null);
        return method.invoke(factoryBean,null);
    }

    //初始化方法
    private void doInit(BeanDefinition beanDefinition, Object instance) throws Exception{
        if (StringUtil.isNotBlank(beanDefinition.getInitMethodName())){
            Method method = instance.getClass().getMethod(beanDefinition.getInitMethodName(),null);
            method.invoke(instance,null);
        }
    }

    @Override
    public void close() throws IOException {
        for (Map.Entry<String,BeanDefinition> entry : this.beanDefinitionMap.entrySet()){
            String beanName = entry.getKey();
            BeanDefinition beanDefinition = entry.getValue();

            if (beanDefinition.isSingleton() && StringUtil.isNotBlank(beanDefinition.getDestoryMethodName())){
                Object instance = this.beanMap.get(beanName);
                try {
                    Method method = instance.getClass().getMethod(beanDefinition.getDestoryMethodName(),null);
                    method.invoke(instance,null);
                }catch (NoSuchMethodException|SecurityException|IllegalAccessException|IllegalArgumentException| InvocationTargetException e){
                    logger.error("执行bean["+beanName+"] "+beanDefinition+"的销毁方法异常",e);
                }
            }
        }
    }
}
