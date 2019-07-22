package com.xiayu.module.user.service.serviceimpl;

/**
 * @Classname Demo
 * @Description
 * @Author hello
 * @Date 2019/7/18 16:59
 * @Version 1.0
 **/


public class Demo {
    public synchronized void f1() {
        System.out.println("synchronized void f1()");
    }

    public void f2() {
        synchronized(this) {
            System.out.println("synchronized(this)");
        }
    }

    public static void main(String[] args) {
        Demo test = new Demo();
        test.f1();
        test.f2();
        Thread thread = new Thread();
    }
}