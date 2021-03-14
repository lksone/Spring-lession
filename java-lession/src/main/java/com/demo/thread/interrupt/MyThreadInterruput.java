package com.demo.thread.interrupt;

public class MyThreadInterruput extends Thread {


    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 1000000; i++) {
            System.out.println("i=" + i);
        }
    }
}
