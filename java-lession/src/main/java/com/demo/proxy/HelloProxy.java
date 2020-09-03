package com.demo.proxy;

/**
 *
 * 代理类(静态代理)
 *
 * @author lks
 * @Time 2020/9/2
 **/
public class HelloProxy implements HelloInterface {


    /**
     * 测试方法
     */
    @Override
    public void hello() {
        System.out.println("測試方法");
    }
}
