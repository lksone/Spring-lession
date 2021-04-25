package com.demo.threadlocal;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FullGC {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            String str = "";
            for (int j = 0; j < 1000; j++) {
                str += UUID.randomUUID().toString();
            }
            list.add(str);
            System.out.println(str);
        }
    }
}
