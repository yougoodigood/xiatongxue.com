package com.xiayu.module.user.service.serviceimpl;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Classname ThreadPoolTest
 * @Description
 * @Author hello
 * @Date 2019/7/23 15:54
 * @Version 1.0
 **/
public class ThreadPoolTest {
    public static void main(String[] args) throws InterruptedException {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
//        ExecutorService executorService = Executors.newFixedThreadPool(15);
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Executors.newCachedThreadPool();
        CountDownLatch countDownLatch = new CountDownLatch(15);
        for (int i = 0; i < 15; i++) {
            MyTask myTask = new MyTask(i,countDownLatch);
            executorService.submit(myTask);
        }
        executorService.shutdown();
        countDownLatch.await();
        StringBuilder stringBuilder;
        StringBuffer stringBuffer;
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.compareAndSet(atomicInteger.get(),atomicInteger.getAndAdd(5));
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        atomicBoolean.compareAndSet(atomicBoolean.get(),true);
        AtomicLong atomicLong = new AtomicLong(1000);
        atomicLong.compareAndSet(1000,10001);
        System.out.println("线程池关闭");
    }
}


class MyTask implements Runnable{
    private int taskNum;
    private CountDownLatch countDownLatch;

    public MyTask(int taskNum,CountDownLatch countDownLatch){
        this.taskNum = taskNum;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println("正在执行task：" + taskNum);
        try{
            Thread.currentThread().sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("task :" + taskNum  + "执行完毕");
        countDownLatch.countDown();
    }
}