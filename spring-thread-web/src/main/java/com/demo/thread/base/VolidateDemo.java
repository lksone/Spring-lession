package com.demo.thread.base;

/**
 * @author lks
 * @describe volidate的方式
 * @Email 1056224715@qq.com
 * @date 2020/12/25 16:10
 **/
public class VolidateDemo {

    private static volatile String data;

    public static void main(String[] args) {
        data = "123";
    }
}
