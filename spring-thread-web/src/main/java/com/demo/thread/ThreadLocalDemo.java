package com.demo.thread;

/**
 * @author lks
 * @describe 项目信息
 * @Email 1056224715@qq.com
 * @date 2020/12/24 18:47
 **/
public class ThreadLocalDemo {
    static String temp = "123";
    public static void main(String[] args) {
        ThreadLocal t1 = new ThreadLocal();
        ThreadLocal t2 = new ThreadLocal();

        t1.set(temp);
        temp = "1231321";
        t2.set(temp);

        System.out.println(t1.get());
        System.out.println(t2.get());
    }
}
