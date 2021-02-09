package com.demo.servializer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClinetDemo {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 8080);
            //获取到流对象
            OutputStream outputStream = socket.getOutputStream();
            //将对象写入到流中
            User user = new User();
            user.setAddr("132江西");
            user.setAge(11);
            user.setUsername("lks");
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(user);
            stream.flush();
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
