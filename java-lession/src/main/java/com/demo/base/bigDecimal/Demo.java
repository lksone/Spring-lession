package com.demo.base.bigDecimal;

import java.math.BigDecimal;

public class Demo {

    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(0.1);
        System.out.println(decimal.toString());

        BigDecimal decimal2 = BigDecimal.valueOf(0.1);

        BigDecimal decimal3 = new BigDecimal("0.1");

        System.out.println(decimal2.toString());
        System.out.println(decimal3.toString());
    }
}
