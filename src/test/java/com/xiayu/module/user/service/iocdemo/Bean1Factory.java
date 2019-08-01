package com.xiayu.module.user.service.iocdemo;

/**
 * @Classname Bean1Factory
 * @Description
 * @Author hello
 * @Date 2019/8/1 13:32
 * @Version 1.0
 **/
public class Bean1Factory {
    public static Bean1 getBean1(){
        return new Bean1();
    }

    public Bean1 getOtherBean1(){
        return new Bean1();
    }
}
