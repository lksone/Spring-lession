package com.demo.servializer;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServiceDemo {

    public static void main(String[] args) {
        try {
            //创建接口
            ServerSocket serverSocket = new ServerSocket(8080);
            //建立连接
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();
            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
            Object o = inputStream1.readObject();
            System.out.println(o);
            inputStream1.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
