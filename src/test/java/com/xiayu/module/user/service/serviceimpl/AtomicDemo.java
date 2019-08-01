package com.xiayu.module.user.service.serviceimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Classname AtomicDemo
 * @Description
 * @Author hello
 * @Date 2019/7/22 14:29
 * @Version 1.0
 **/
public class AtomicDemo {
    private volatile int count = 0;
    private static int THREADECOUNT = 100000;
    public static void main(String[] args) throws Exception{
        List<Thread> threadList = new ArrayList<>(THREADECOUNT);
        CountDownLatch countDownLatch = new CountDownLatch(THREADECOUNT);
        CyclicBarrier cyclicBarrier = new CyclicBarrier(THREADECOUNT + 1);
        final AtomicDemo atomicDemo = new AtomicDemo();
        for (int i = 0; i < THREADECOUNT; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        cyclicBarrier.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println(atomicDemo.count);
                    atomicDemo.count++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    countDownLatch.countDown();
                }
            });
            threadList.add(thread);
        }
        threadList.forEach(thread -> thread.start());
        System.out.println("所有线程开始运行");
        cyclicBarrier.await();
        countDownLatch.await();
        System.out.println("result:" + atomicDemo.count);
    }


    /**
     * 3d：blender、字幕（专业词汇+英语）
     *
     */
}
