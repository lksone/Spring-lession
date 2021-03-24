package com.demo.base.hashmap;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lks
 * @describe todo
 * @date 2020/9/4 10:07
 **/
public class HashmapDemo {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("12","ljks");
        map.put("12","ljks");
        map.put("32","ljks");

        System.out.println(map);

        String a = "-1124497183";
        BigInteger a1 = new BigInteger(a);
        System.out.println(a1.toString(2));
    }
}
