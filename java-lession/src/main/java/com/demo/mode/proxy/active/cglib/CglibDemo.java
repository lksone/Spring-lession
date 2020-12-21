package com.demo.mode.proxy.active.cglib;

import com.demo.mode.proxy.active.BuyHouse;
import com.demo.mode.proxy.active.BuyHouseImpl;

public class CglibDemo {

    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy proxy = new CglibProxy();
        BuyHouseImpl  instance = (BuyHouseImpl )proxy.getInstance(buyHouse);
        instance.buyHouse();
    }
}
