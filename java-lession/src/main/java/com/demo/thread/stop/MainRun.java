package com.demo.thread.stop;

public class MainRun {

    /**
     * 注意时间差的大小，不然的话结果对不上
     *
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        SynchronizedObject synchronizedObject = new SynchronizedObject();
        Thread thread = new MyThread(synchronizedObject);
        thread.start();
        //这里是赋值的过程
        Thread.sleep(500);
        thread.stop();
        System.out.println(synchronizedObject.getName() + "  " + synchronizedObject.getPassword());
    }
}
