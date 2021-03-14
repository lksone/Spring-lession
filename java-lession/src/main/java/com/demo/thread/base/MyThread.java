package com.demo.thread.base;

public class MyThread extends Thread {

    @Override
    public void run() {
        long startTIme = System.currentTimeMillis();
        String name = Thread.currentThread().getName();
        System.out.println("当前执行线程--" + name + "   " + startTIme);
        try {
            Thread.sleep(100);
            System.out.println(name + "end");
        } catch (InterruptedException e) {
            System.out.println("MyThread.run is exception");
        }
    }
}
