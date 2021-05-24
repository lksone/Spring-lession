package com.demo.base.consumer;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2021/5/24 10:44
 */
public class App {

    public static void main(String[] args) {
        Demo demo = new Demo();

        for (int i = 0; i < 10; i++) {
            new Thread(new Producer(demo)).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new Consumer(demo)).start();
        }
    }
}
