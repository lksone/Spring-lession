package com.demo.leecode.middle;

/**
 *
 * 快速幂的算法
 *  a^n次方幂怎么计算呢
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/9 18:11
 */
public class QueryPower {


    /**
     * 快速幂次方
     *
     * @param base
     * @param power
     */
    public static long binExp(long base, long power) {
        long result = 1;
        while (power > 0) {
            //如果有餘數的話，那麼power -1
            if((power & 1) == 1){
                power = power - 1;
                result = result * base;
            }
            power = power >> 1;
            base = base * base;
        }
        return result;
    }

    public static void main(String[] args) {
        long a = binExp(2, 3);
        System.out.println(a);
    }
}
