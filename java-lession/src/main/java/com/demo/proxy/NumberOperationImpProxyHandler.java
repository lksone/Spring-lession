package com.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 *
 * @author lks
 * @Time 2020/9/2
 **/
public class NumberOperationImpProxyHandler<T> implements InvocationHandler {


    private T tager;


    public NumberOperationImpProxyHandler(T tager) {
        this.tager = tager;
    }

    /**
     * 代理类
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(tager,args);
    }
}
