package com.demo.thread.service;

import java.util.concurrent.TimeUnit;

public class TastTest {


    public static void main(String[] args) {
        final TaskLifecycle<String> lifecycle = new TaskLifecycle.EmptyLifecycle<String>() {
            @Override
            public void onFinish(Thread thread, String result) {
                System.out.println(" the result is " + result);
            }
        };

        Observable observable = new ObservableThread<>(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("fish");
            return "hello Observice";
        }, lifecycle);
        observable.start();
    }
}
