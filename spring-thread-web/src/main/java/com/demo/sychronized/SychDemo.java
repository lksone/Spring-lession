package com.demo.sychronized;


import java.util.concurrent.TimeUnit;

/**
 * 数据的更新
 */
public class SychDemo {

    public  synchronized void test(){
        try {
            System.out.println(Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public  void test2(){
        synchronized (this){
            try {
                System.out.println(Thread.currentThread().getName()+"mode in ");
                TimeUnit.SECONDS.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        SychDemo demo = new SychDemo();
        new Thread(()->{
            demo.test();
        },"sychronized").start();
        new Thread(()->{
            demo.test();
        },"test2").start();
    }
}
