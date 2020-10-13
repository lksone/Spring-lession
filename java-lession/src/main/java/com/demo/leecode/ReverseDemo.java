package com.demo.leecode;

/**
 * @author lks
 * @date 2020/10/13
 * <p>
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class ReverseDemo {


    private static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
            res = res * 10 + x % 10;
            x = x / 10;
        }

        return res;
    }

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(reverse(a));
    }
}
