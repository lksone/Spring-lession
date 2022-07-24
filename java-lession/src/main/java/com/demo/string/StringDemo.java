package com.demo.string;

/**
 * @author lks
 * @date 2020-09-01 22:21
 * @email 1056224715@qq.com
 * @Description String类型的讲解
 */
public class StringDemo {

    public static void main(String[] args) {
        String a = "abc";
        String intern = a.intern();
        String b = new String("abc");
        String c = new String("abc");

        System.out.println(intern==c);
    }
}
