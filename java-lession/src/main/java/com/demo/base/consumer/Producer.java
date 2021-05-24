package com.demo.base.consumer;

import java.util.Random;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/24 10:39
 */
public class Producer implements Runnable {

    private Demo demo;

    public Producer(Demo demo) {
        this.demo = demo;
    }

    @Override
    public void run() {
        demo.put(String.valueOf(new Random().nextInt()));
    }
}
