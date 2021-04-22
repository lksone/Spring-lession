package com.demo.thread;

import io.netty.util.concurrent.FastThreadLocal;

public class FastThreadLocalDemo {

    public static void main(String[] args) {
        FastThreadLocal demo = new FastThreadLocal();
        demo.set("1231123");
    }
}
