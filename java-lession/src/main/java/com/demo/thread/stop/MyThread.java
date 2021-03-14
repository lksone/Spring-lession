package com.demo.thread.stop;

public class MyThread extends Thread {

    private SynchronizedObject object;

    public MyThread(SynchronizedObject object) {
        this.object = object;
    }


    @Override
    public void run() {
        object.printString("lks", "123");
        System.out.println("MyThread.run");
    }
}
