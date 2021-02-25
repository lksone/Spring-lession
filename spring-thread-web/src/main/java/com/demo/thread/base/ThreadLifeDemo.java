package com.demo.thread.base;

import ch.qos.logback.core.util.TimeUtil;

import java.util.concurrent.TimeUnit;

/**
 * @author lks
 * @describe 线程生命周期
 * @Email 1056224715@qq.com
 * @date 2020/12/23 09:59
 **/
public class ThreadLifeDemo {

    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("線程阻塞");
        }, "Time_Watting").start();

        new Thread(() -> {
            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "waitting").start();
    }
}
