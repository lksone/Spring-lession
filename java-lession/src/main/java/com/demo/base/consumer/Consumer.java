package com.demo.base.consumer;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/24 10:42
 */
public class Consumer implements Runnable {

    private Demo demo;

    public Consumer(Demo demo) {
        this.demo = demo;
    }


    @Override
    public void run() {
        String take = demo.take();
        System.out.println(take);
    }
}
