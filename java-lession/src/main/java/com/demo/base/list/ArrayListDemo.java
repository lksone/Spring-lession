package com.demo.base.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    /**
     * 会发生数组越界的现象
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("123");
        list.add("123");
        list.add("1234");
       /* for (String s : list) {
            if (s.equals("1234"))
                list.remove("1234");
        }*/
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ("1234".equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
