package com.demo.mode.proxy.active;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {

    private Object object;

    public DynamicProxyHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("动态代理前---");
        Object invoke = method.invoke(object, args);
        System.out.println("动态代理后----");
        return invoke;
    }
}
