package com.demo.thread.service;

public interface TaskLifecycle<T> {

    void onstart(Thread thread);

    void onRunning(Thread thread);

    void onFinish(Thread thread, T result);

    void onError(Thread thread);

    //实现一个空的方法
    class EmptyLifecycle<T> implements TaskLifecycle<T> {


        @Override
        public void onstart(Thread thread) {

        }

        @Override
        public void onRunning(Thread thread) {

        }

        @Override
        public void onFinish(Thread thread, T result) {

        }

        @Override
        public void onError(Thread thread) {

        }
    }
}
