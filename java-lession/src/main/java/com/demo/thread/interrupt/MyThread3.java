package com.demo.thread.interrupt;

public class MyThread3 extends Thread {

    @Override
    public void run() {
        super.run();
        //其实当前线程并不会不执行，间接的说明interrput只是标识了一个状态
        for (int i = 0; i < 50000; i++) {
            if (this.isInterrupted()) {
                System.out.println("线程中止，for循环不再执行了");
                break;
            }
            System.out.println("MyThread3.run" + (i + 1));
        }
        System.out.println("循环外的方法还是会执行，方法内的方法不执行了");
    }
}
