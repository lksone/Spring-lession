package com.demo.mode.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        BuyHouse house = new BuyHouseImpl();
        house.buyHouse();

        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(house);
        buyHouseProxy.buyHouse();
    }
}
