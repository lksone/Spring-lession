package com.demo.proxy;

import java.math.BigDecimal;

/**
 * 添加接口的方式和方法
 *
 * @author lks
 * @Time 2020/9/2
 **/
public class NumberOperation implements NumberOperationInterface {

    /**
     * 添加接口
     *
     * @param a
     * @param b
     * @return
     */
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }
}
