package com.demo.thread.pool;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/15 12:56
 */
public class ThreadDemo implements Runnable{

    private Integer number;

    public ThreadDemo(Integer number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number+",这是一个线程");
    }
}
