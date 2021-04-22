package com.demo.base;

public class ThreadLocalDemo {


    public static void main(String[] args) {

        final ThreadLocal threadLocal = new ThreadLocal() {
            protected Object initialValue() {
                return "xiexini";
            }
        };

        new Thread(()->{
            System.out.println(threadLocal.get());
        }).start();



    }
}
