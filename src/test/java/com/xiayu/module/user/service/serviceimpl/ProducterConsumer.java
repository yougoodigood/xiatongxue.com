package com.xiayu.module.user.service.serviceimpl;

/**
 * @Classname ProducterConsumer
 * @Description
 * @Author hello
 * @Date 2019/7/25 10:47
 * @Version 1.0
 **/
public class ProducterConsumer {

    public Integer resource ;

    public static void main(String[] args) {
        ProducterConsumer producterConsumer = new ProducterConsumer();
        producterConsumer.resource = 0;
        System.out.println("start");
        Producter producter = new Producter(producterConsumer);
        Consumer consumer = new Consumer(producterConsumer);
        producter.start();
        consumer.start();
    }
}


class Producter extends Thread{

    private ProducterConsumer producterConsumer;

    public Producter(ProducterConsumer producterConsumer){
        this.producterConsumer = producterConsumer;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("生产者进入循环");
            synchronized (producterConsumer){
                System.out.println("生产者抢到锁");
                while (producterConsumer.resource == 1){
                    System.out.println("生产者发现产品未被消费");
                    try {
                        producterConsumer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                producterConsumer.resource = 1;
                System.out.println("生产了一个产品");
                producterConsumer.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Consumer extends Thread{

    private ProducterConsumer producterConsumer;

    public Consumer(ProducterConsumer producterConsumer){
        this.producterConsumer = producterConsumer;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("消费者进入循环");
            synchronized (producterConsumer){
                System.out.println("消费者抢到锁");
                while (producterConsumer.resource == 0){
                    try {
                        System.out.println("消费者发现没有产品");
                        producterConsumer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                producterConsumer.resource = 0;
                System.out.println("消费了一个产品");
                producterConsumer.notify();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

