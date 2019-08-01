package com.xiayu.module.user.service.serviceimpl;

/**
 * @Classname ProducterCosumer2
 * @Description
 * @Author hello
 * @Date 2019/7/25 13:22
 * @Version 1.0
 **/
public class ProducterCosumer2 {

    public int resource = 0;

    public static void main(String[] args) {
        ProducterCosumer2 producterCosumer2 = new ProducterCosumer2();
        producterCosumer2.resource = 1;
        Producter2 producter2 = new Producter2(producterCosumer2);
        Consumer2 consumer2 = new Consumer2(producterCosumer2);
        new Thread(producter2).start();
        new Thread(consumer2).start();
    }
}

class Producter2 implements Runnable{

    private ProducterCosumer2 producterCosumer2;

    public Producter2(ProducterCosumer2 producterCosumer2){
        this.producterCosumer2 = producterCosumer2;
    }

    @Override
    public void run() {
        while(true){
            synchronized (producterCosumer2){
                while(producterCosumer2.resource == 1){
                    try {
                        producterCosumer2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                producterCosumer2.resource = 1;
                System.out.println("生产了一个产品");
                producterCosumer2.notify();
            }
        }
    }
}


class Consumer2 implements Runnable{

    private ProducterCosumer2 producterCosumer2;

    public Consumer2(ProducterCosumer2 producterCosumer2){
        this.producterCosumer2 = producterCosumer2;
    }

    @Override
    public void run() {
        while(true){//保证一直能够竞争锁
            synchronized (producterCosumer2){
                while(producterCosumer2.resource == 0){//一直判断资源是否已经存在
                    try {
                        producterCosumer2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                producterCosumer2.resource = 0;
                System.out.println("消费了生产品");
                producterCosumer2.notify();
            }
        }
    }
}