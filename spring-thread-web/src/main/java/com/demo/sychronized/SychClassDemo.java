package com.demo.sychronized;

import java.util.concurrent.TimeUnit;

public class SychClassDemo {


    public  void test2(){
        synchronized (SychClassDemo.class){
            try {
                System.out.println(Thread.currentThread().getName()+"mode in ");
                TimeUnit.SECONDS.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //不同的对象，也是同一个值去等待
        new Thread(()->{
            new SychClassDemo().test2();
        },"sychronized").start();
        new Thread(()->{
            new SychClassDemo().test2();
        },"test2").start();
    }
}
