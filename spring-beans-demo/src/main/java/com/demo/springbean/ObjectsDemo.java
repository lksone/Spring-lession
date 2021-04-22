package com.demo.springbean;

import java.util.Objects;

/**
 * @author lks
 * @Time 2020/9/1
 **/
public class ObjectsDemo {

    public static void main(String[] args) {
        String msg = null;
        String s = Objects.requireNonNull(msg);

        System.out.println(s);
    }
}
