package com.xiayu.module.user.service.serviceimpl;

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
    }


}
