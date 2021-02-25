package com.demo.refence;

/**
 * @author lks
 * @describe todo
 * @Email 1056224715@qq.com
 * @date 2020/12/24 16:51
 **/
public class PwofulDemo {

    public static void main(String[] args) {
        M m = new M();
        m=null;
        System.out.println(m.hashCode());
        System.gc();
    }
}
