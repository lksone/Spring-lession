package com.demo.map;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author lks
 * @describe currentHashMap的重要事项
 * @date 2020/9/7 11:36
 **/
public class ConcurrentHashMapDemo {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> concurrentHashMap = new ConcurrentHashMap<>();

        concurrentHashMap.put(1,"fdsa");
        concurrentHashMap.put(2,"fdsa");
        concurrentHashMap.put(3,"fdsa");
        concurrentHashMap.put(4,"fdsa");
        concurrentHashMap.put(5,"fdsa");

        System.out.println(concurrentHashMap);
        Integer a = 0x7fffffff;
        System.out.println(a);
    }
}
