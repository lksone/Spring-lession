package com.demo.rpc;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/16 01:10
 */
public class Demo {

    public static void main(String[] args) {
        ServiceLoader<DemoService> serviceLoader = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> it = serviceLoader.iterator();
        while (it.hasNext()) {
            DemoService demoService = it.next();
            System.out.println("class:"+demoService.getClass().getName()+","+demoService.sayHi("World"));
        }
    }
}
