package com.demo.base.set;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add(null);
        set.add(null);
        set.add(null);
        System.out.println(set);
    }
}
