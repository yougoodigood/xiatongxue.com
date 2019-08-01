package com.xiayu.module.user.service.serviceimpl;

import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Classname SynchronizedDemo
 * @Description
 * @Author hello
 * @Date 2019/7/18 16:39
 * @Version 1.0
 **/
public class SynchronizedDemo {
    public static void main(String[] args){
        synchronized (SynchronizedDemo.class){
            System.out.println("sychronized block");
        }
        SynchronizedDemo demo = new SynchronizedDemo();
        demo.synchronizedMethod();
    }

    public synchronized void synchronizedMethod(){
        System.out.println("synchronized method");

        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("test.xml"));
        Object myTest = xmlBeanFactory.getBean("myTest");
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
    }
}
