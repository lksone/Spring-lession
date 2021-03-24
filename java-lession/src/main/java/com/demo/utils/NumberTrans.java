package com.demo.utils;

import java.math.BigInteger;

public class NumberTrans {


    /**
     * 二进制转换
     *
     * @param src
     */
    public static String transBinary(String src) {
        return new BigInteger(src).toString(2);
    }
}
