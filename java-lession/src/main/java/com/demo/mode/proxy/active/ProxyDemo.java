package com.demo.mode.proxy.active;

import java.lang.reflect.Proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        BuyHouseImpl buyHouse = new BuyHouseImpl();
        BuyHouse o = (BuyHouse)Proxy.newProxyInstance(BuyHouse.class.getClassLoader(), new Class[]{BuyHouse.class}, new DynamicProxyHandler(buyHouse));
        o.buyHouse();
    }
}
