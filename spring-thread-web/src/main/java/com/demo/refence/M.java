package com.demo.refence;

/**
 * @author lks
 * @describe  普通对象的方法和使用的方法
 * @Email 1056224715@qq.com
 * @date 2020/12/24 16:49
 **/
public class M {


    @Override
    protected void finalize() throws Throwable {
        System.out.println("垃圾回收");
    }
}
