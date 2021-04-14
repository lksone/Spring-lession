package com.demo.dependLoop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        ABean a = context.getBean(ABean.class);
        System.out.println(a);
    }
}
