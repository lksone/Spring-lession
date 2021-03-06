package com.demo.thread.interrupt;


/**
 * 线程中沉睡停止
 */
public class MyThread4 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("线程开始。。。");
            Thread.sleep(200000);
            System.out.println("线程结束。");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止, 进入catch， 调用isInterrupted()方法的结果是：" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
