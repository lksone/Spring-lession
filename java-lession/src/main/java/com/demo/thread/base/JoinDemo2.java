package com.demo.thread.base;

public class JoinDemo2 {

    public static void main(String[] args) throws InterruptedException {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        MyThread bt = new MyThread();
        Thread.sleep(2000);
        Thread.currentThread().interrupt();
        bt.start();
        bt.join();
        System.out.println(threadName + " end!");
    }
}
