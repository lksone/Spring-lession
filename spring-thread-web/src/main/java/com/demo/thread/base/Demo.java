package com.demo.thread.base;

/**
 * @author lks
 * @describe todo
 * @Email 1056224715@qq.com
 * @date 2020/12/24 14:36
 **/
public class Demo {
    private static volatile int a = 1;
    public static void main(String[] args) {
        a++;
    }
}
