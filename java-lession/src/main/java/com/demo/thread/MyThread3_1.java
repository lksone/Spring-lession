package com.demo.thread;


/**
 * 可以采用异常处理的方式中断线程
 */
public class MyThread3_1 extends Thread {
    @Override
    public void run() {
        super.run();
        //其实当前线程并不会不执行，间接的说明interrput只是标识了一个状态
        try {
            for (int i = 0; i < 50000; i++) {
                if (this.isInterrupted()) {
                    throw new Exception("当前线程中断的方式和方法");
                }
                System.out.println("MyThread3.run" + (i + 1));
            }
            System.out.println("循环外的方法还是会执行，方法内的方法不执行了");
        } catch (Exception e) {
            System.out.println("进入异常中断");
        }
    }
}
