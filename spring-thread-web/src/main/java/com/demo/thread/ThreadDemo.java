package com.demo.thread;

/**
 * @author lks
 * @describe 线程处理的方式和方法
 * @date 2020/12/22 18:22
 **/
public class ThreadDemo extends Thread{

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
    public void run() {

    }
}
