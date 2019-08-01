package com.xiayu.module.user.service.serviceimpl;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname ProducterConsumerTest
 * @Description
 * @Author hello
 * @Date 2019/7/31 10:10
 * @Version 1.0
 **/
public class ProducterConsumerTest {

    public int resource;

    public static void main(String[] args) throws IOException {
        ProducterConsumerTest test = new ProducterConsumerTest();
        test.resource = 0;
        new Product(test).start();
        new Consume(test).start();


        Socket socket = new Socket("127.0.0.1",9999);
        Writer writer = new OutputStreamWriter(socket.getOutputStream());
        writer.write("3422222");
        writer.flush();
        writer.close();
        socket.close();


        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket1 = serverSocket.accept();
        Reader reader = new InputStreamReader(socket1.getInputStream());
        int len = 0;
        char[] temp = new char[1024];
        while ((len = reader.read(temp)) != 0){
            System.out.println(temp);
        }
        reader.close();
        socket1.close();
        serverSocket.close();
    }
}

class Product extends Thread{

    private ProducterConsumerTest test;

    public Product(ProducterConsumerTest test){
        this.test = test;
    }

    @Override
    public void run() {
        while (true){
            synchronized (this.test){
                while (test.resource == 1){
                    try {
                        this.test.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                test.resource = 1;
                this.test.notify();
            }
        }
    }
}

class Consume extends Thread{

    private ProducterConsumerTest test;

    public Consume(ProducterConsumerTest test){
        this.test = test;
    }

    @Override
    public void run() {
        while(true){
            synchronized (this.test){
                while (this.test.resource == 0){
                    try {
                        this.test.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                test.resource = 0;
                this.test.notify();
            }
        }
    }
}



