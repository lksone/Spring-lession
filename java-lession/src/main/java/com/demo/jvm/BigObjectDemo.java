package com.demo.jvm;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/27 00:31
 */
public class BigObjectDemo {

    private static final int _1MB = 1024 * 1024;

    /*** VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:Survivor- Ratio=8 -XX:MaxTenuringThreshold=1 * -XX:+PrintTenuringDistribution */
    @SuppressWarnings("unused")
    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        // 什么时候进入老年代决定于XX:MaxTenuring- Threshold设置 allocation2 = new byte[4 * _1MB]; allocation3 = new byte[4 * _1MB]; allocation3 = null; allocation3 = new byte[4 * _1MB]; }
        allocation1 = new byte[_1MB / 4];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }

}
