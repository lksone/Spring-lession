package com.demo.string;

/**
 * @author lks
 * @date 2020-09-01 22:21
 * @email 1056224715@qq.com
 * @Description String类型的讲解
 */
public class StringDemo {

    public static void main(String[] args) {
        method();
    }

    private static void strMethod() {
        String msg1 = "123123";
        String msg = new String("123") + new String("123");
        String intern = msg.intern();
        String.valueOf(12);
        System.out.println(msg1 == intern);
    }

    /**
     * false
     */
    private static void StrMethod1() {
        String msg1 = "123123";
        String msg = new String("123") + new String("123");
        System.out.println(msg == msg1);
    }


    public static void method(){
        //常量池中
        String a = "123";
        //堆中，主要是通过对象new的
        String b = new String("123");
        System.out.println(a==b);
    }
}
