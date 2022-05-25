package com.demo.string;

import java.util.UUID;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/25 11:00
 */
public class StringDemo2 {

    public static void main(String[] args) {
        System.out.println(Father3.str);
        System.out.println(Father3.t);
        System.out.println(Father4.str);
    }


}
class Father{
    //這是一個字符串常量池，在編譯階段就存入了类常量池中
    public static final String str = "Hello,world";
    static {
        System.out.println("Father static block");
    }
}

class Father1{
    //这是编译过后的对象存入到了堆中
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("Father static block");
    }
}

class Father2{
    public static final String str = "Hello,world";
    public static final short s = 6;
    public static final int t = 128;
    static {
        System.out.println("Father static block");
    }
}
class Father3{
    public static final String str = "Hello,world";

    public static final int t = 1;
    static {
        System.out.println("Father static block");
    }
}

class Father4{
    public static String str = "Hello,world";

    static {
        System.out.println("Father static block");
    }
}