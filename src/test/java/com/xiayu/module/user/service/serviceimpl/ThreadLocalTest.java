package com.xiayu.module.user.service.serviceimpl;

import java.util.Stack;
import java.util.concurrent.*;

/**
 * @Classname ThreadLocalTest
 * @Description
 * @Author hello
 * @Date 2019/7/23 9:27
 * @Version 1.0
 **/
public class ThreadLocalTest {
    private static final ThreadLocal<Long> TIME_THREADLOCAL = new ThreadLocal<Long>(){
        protected Long initialValue(){
            return System.currentTimeMillis();
        }
    };
    public static final void begin(){
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }
    public static final long end(){
        ConcurrentHashMap<String,String> concurrentHashMap = new ConcurrentHashMap<>();
        Stack<String> stack = new Stack<>();
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        return System.currentTimeMillis() - TIME_THREADLOCAL.get();

    }

    public static void main(String[] args) throws Exception{
        ThreadLocalTest.begin();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("cost:" + ThreadLocalTest.end() + " mills");
    }
}
