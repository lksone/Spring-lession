package com.demo.rpc;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/16 01:02
 */
public class EnglishDemoServiceImpl implements DemoService{
    @Override
    public String sayHi(String msg) {
        return "hello";
    }
}
