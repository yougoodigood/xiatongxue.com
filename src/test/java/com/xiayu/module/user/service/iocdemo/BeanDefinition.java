package com.xiayu.module.user.service.iocdemo;


import jodd.util.StringUtil;

public interface BeanDefinition {
    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    Class<?> getBeanClass();
    String getScope();
    boolean isSingleton();
    boolean isPrototype();
    String getFactoryBeanName();
    String getFactoryMethodName();
    String getInitMethodName();
    String getDestoryMethodName();

    default boolean validate(){
        if(this.getBeanClass()==null){
            if (StringUtil.isBlank(getFactoryBeanName()) || StringUtil.isBlank(getFactoryMethodName())){
                return false;
            }

            if (this.getBeanClass()!=null && StringUtil.isNotBlank(getFactoryBeanName())){
                return false;
            }
        }
        return true;
    }
}
