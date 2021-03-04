package com.demo.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lks
 * @describe todo
 * @Email 1056224715@qq.com
 * @date 2020/12/29 16:01
 **/
public class StreamDemo2 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("2BA4D2CE-D52A-EB11-B0BD-0017FA032700");
        list.add("123A");
        list.add("123B");
        list.add("123C ");

        boolean b = list.stream().anyMatch(a -> a.equalsIgnoreCase("2CE-D52A-EB11-B0BD-0017FA032700"));
        System.out.println(b);

        System.out.println("2ba4d2ce-d52a-eb11-b0bd-0017fa032700".toUpperCase());

    }
}
