package com.lks.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "fdsaf");
        map.put(2, "fdsaf");
        map.put(3, "fdsaf");
        map.put(4, "fdsaf");
        map.put(5, "fdsaf");
        map.put(6, "fdsaf");
        map.put(7, "fdsaf");
        map.put(8, "fdsaf");
        map.put(9, "fdsaf");
        map.put(10, "fdsaf");
        map.put(11, "fdsaf");
        map.put(12, "fdsaf");
        map.put(13, "fdsaf");
        map.put(14, "fdsaf");
        map.put(15, "fdsaf");
        map.put(16, "fdsaf");
        map.put(17, "fdsaf");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            if (Integer.valueOf(1).equals(key)) {
                map.remove(key);
            }
        }
    }
}
