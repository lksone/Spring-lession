package com.demo.base.hashmap;

import java.math.BigInteger;
import java.util.HashMap;

/**
 * @author lks
 * @describe
 * 1、key和value都能够为null
 * 2、
 * @date 2020/9/4 10:07
 **/
public class HashmapDemo {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put(null, null);
        map.put("12", "ljks");
        map.put("32", "ljks");

        System.out.println(map);

        String a = "-1";
        BigInteger a1 = new BigInteger(a);
        System.out.println(a1.toString(2));
    }
}
