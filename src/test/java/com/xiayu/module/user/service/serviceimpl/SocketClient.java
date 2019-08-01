package com.xiayu.module.user.service.serviceimpl;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

/**
 * @Classname SocketClient
 * @Description
 * @Author hello
 * @Date 2019/7/25 15:38
 * @Version 1.0
 **/
public class SocketClient {
    public static void main(String[] args) throws IOException {
        String host = "127.0.0.1";
        int port = 9999;
        Socket client = new Socket(host,port);
        Writer write = new OutputStreamWriter(client.getOutputStream());
        write.write("hello server");
        write.flush();
        write.close();
        client.close();
    }
}
