package com.demo.thread.base;


/**
 * join的用法：在主线程执行的时候，主线程需要知道子线程的执行的方法的结果，
 * 那么就需要join线程的加入，主线程等待阻塞；
 * <p>
 * 是主线程等待子线程的终止。也就是说主线程的代码块中，如果碰到了t.join()方法，
 * 此时主线程需要等待（阻塞），等待子线程结束了(Waits for this thread to die.),才能继续执行t.join()之后的代码块。
 */
public class JoinDemo {

    public static void main(String[] args) {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " start.");
        MyThread bt = new MyThread();
        try {
            bt.start();
            bt.join();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("Exception from main");
        }
        System.out.println(threadName + " end!");
    }

}
