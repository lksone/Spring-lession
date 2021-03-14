package com.demo.thread;

public class MyThreadInterruput2 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 100000; i++) {
            i++;
        }
    }
}
