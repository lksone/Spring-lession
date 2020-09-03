package com.demo.proxy;


import java.lang.reflect.Proxy;

/**
 * @author lks
 * @Time 2020/9/2
 **/
public class ProxyTest {

    public static void main(String[] args) {
        NumberOperationInterface numberOperation = new NumberOperation();
        NumberOperationInterface o = getNumberOperationInterface(numberOperation);
        System.out.println(o.add(1,2));
    }

    private static NumberOperationInterface getNumberOperationInterface(NumberOperationInterface numberOperation) {
        return (NumberOperationInterface) Proxy.newProxyInstance(NumberOperationInterface.class.getClassLoader(), new Class[]{NumberOperationInterface.class}, new NumberOperationImpProxyHandler(numberOperation));
    }
}
