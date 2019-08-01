package com.xiayu.module.user.service.serviceimpl;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Classname SocketServer
 * @Description
 * @Author hello
 * @Date 2019/7/25 15:41
 * @Version 1.0
 **/
public class SocketServer {
    public static void main(String[] args) throws IOException {
        int port = 9999;
        ServerSocket serverSocket = new ServerSocket(port);
        Socket socket = serverSocket.accept();
        Reader reader = new InputStreamReader(socket.getInputStream());
        char chars[] = new char[1024];
        int len;
        StringBuilder stringBuilder = new StringBuilder();
        while((len=reader.read(chars)) != -1){
            stringBuilder.append(new String(chars,0,len));
            System.out.println(new String(chars,0,len));
        }
        System.out.println("info:" + stringBuilder);
        reader.close();
        socket.close();
        serverSocket.close();
    }
}
