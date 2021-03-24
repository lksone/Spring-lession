package com.demo.base.hashmap;

import java.util.Collections;
import java.util.HashMap;

/**
 * @author lks
 * @date 2020-09-06 22:45
 * @email 1056224715@qq.com
 * @Description todo
 */
public class HashMapDemo2 {


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("123", "fds");
        map.remove("123");


        Collections.synchronizedMap(map);
        User user = new User();
        user.setAge(11);
        user.setName("lks");
        User user2 = new User();
        user2.setAge(11);
        user2.setName("lks");
        System.out.println(user == user2);
    }
}
