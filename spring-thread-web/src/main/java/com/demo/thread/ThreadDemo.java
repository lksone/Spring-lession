package com.demo.thread;

import java.util.concurrent.TimeUnit;

public class ThreadDemo {

    public static void main(String[] args) {
        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"time_waitting").start();

    }
}
