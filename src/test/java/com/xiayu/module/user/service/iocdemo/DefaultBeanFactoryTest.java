package com.xiayu.module.user.service.iocdemo;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Classname DefaultBeanFactoryTest
 * @Description
 * @Author hello
 * @Date 2019/8/1 13:33
 * @Version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class DefaultBeanFactoryTest {
    private static DefaultBeanFactory defaultBeanFactory = new DefaultBeanFactory();

    @Test
    public void testRegist() throws Exception {
        GeneralBeanDefinition generalBeanDefinition = new GeneralBeanDefinition();
        generalBeanDefinition.setBeanClass(Bean1.class);
        generalBeanDefinition.setScope(BeanDefinition.SCOPE_SINGLETON);
        generalBeanDefinition.setInitMethodName("init");
        generalBeanDefinition.setDestroyMethodName("destroy");
        defaultBeanFactory.registerBeanDefinition("bean1", generalBeanDefinition);
    }

    @Test
    public void testRegistStaticFactoryMethod() throws Exception {
        GeneralBeanDefinition generalBeanDefinition = new GeneralBeanDefinition();
        generalBeanDefinition.setBeanClass(Bean1Factory.class);
        generalBeanDefinition.setFactoryMethodName("getBean1");
        defaultBeanFactory.registerBeanDefinition("staticBean1", generalBeanDefinition);
    }

    @Test
    public void testRegistFactoryMethod() throws Exception {
        GeneralBeanDefinition generalBeanDefinition = new GeneralBeanDefinition();
        generalBeanDefinition.setBeanClass(Bean1Factory.class);
        String factoryBeanName = "factory";
        defaultBeanFactory.registerBeanDefinition(factoryBeanName, generalBeanDefinition);

        generalBeanDefinition = new GeneralBeanDefinition();
        generalBeanDefinition.setFactoryBeanName(factoryBeanName);
        generalBeanDefinition.setFactoryMethodName("getOtherBean1");
        generalBeanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
        defaultBeanFactory.registerBeanDefinition("factoryBean", generalBeanDefinition);
    }

    @AfterClass
    public static void testGetBean() throws Exception {
        System.out.println("构造方法方式。。。");
        for (int i = 0; i < 3; i++) {
            Bean1 bean1 = (Bean1) defaultBeanFactory.getBean("bean1");
            bean1.doSomething();
        }

        System.out.println("静态工厂方法方式。。。");
        for (int i = 0; i < 3; i++) {
            Bean1 bean1 = (Bean1) defaultBeanFactory.getBean("bean1");
            bean1.doSomething();
        }

        System.out.println("工厂方法方式。。。");
        for (int i = 0; i < 3; i++) {
            Bean1 bean1 = (Bean1) defaultBeanFactory.getBean("bean1");
            bean1.doSomething();
        }

        defaultBeanFactory.close();
    }
}
