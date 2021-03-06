package com.demo.string;

/**
 * @author lks
 * @date 2020-09-01 22:21
 * @email 1056224715@qq.com
 * @Description String类型的讲解
 */
public class StringDemo {

    public static void main(String[] args) {
       // StrMethod1();
      //  strMethod();

        int i = Math.addExact(12, 12);
        System.out.println(i);

        System.out.println(12^24);
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

}
