package com.xiayu.module.user.service.iocdemo;

/**
 * @Classname Bean1
 * @Description
 * @Author hello
 * @Date 2019/8/1 13:30
 * @Version 1.0
 **/
public class Bean1 {
    public void doSomething(){
        System.out.println(System.currentTimeMillis() + " " + this);
    }

    public void init(){
        System.out.println("bean1的init已经执行");
    }

    public void destroy(){
        System.out.println("bean1的destroy已经执行");
    }
}
