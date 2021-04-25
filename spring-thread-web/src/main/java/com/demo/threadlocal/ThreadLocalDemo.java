package com.demo.threadlocal;

public class ThreadLocalDemo {

    public static void main(String[] args) {
        ThreadLocal<String> demo = new ThreadLocal<>();
        demo.set("123");
    }
}
