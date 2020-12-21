package com.demo.mode.proxy.active.jdk;

import com.demo.mode.proxy.active.BuyHouse;
import com.demo.mode.proxy.active.BuyHouseImpl;

import java.lang.reflect.Proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        BuyHouse o = (BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        o.buyHouse();
    }
}
