package com.demo.leecode;

/**
 * @author lks
 * @date 2020/10/13
 */
public class longestPalindrome {

    /**
     * 获取最长的字串
     *
     * @param target
     * @return
     */
    public static String longestPalindromeDe(String target) {
        int length = target.length();
        if (length < 2) {
            return target;
        }
        int maxlen = 1;
        String res = target.substring(0, 1);
        // 中心位置
        for (int i = 0; i < length - 1; i++) {
            String ood = centerSpard(target, i, i);
            String od = centerSpard(target, i, i + 1);
            String maxStr = ood.length() > od.length() ? ood : od;
            if (maxlen < maxStr.length()) {
                maxlen = maxStr.length();
                res = maxStr;
            }
        }
        return res;
    }

    /**
     * 获取中心扩散的方法获取最长的回文字段
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    public static String centerSpard(String s, int left, int right) {
        int len = s.length();
        int i = left;
        int j = right;
        while (left >= 0 && right < len) {
            if (s.charAt(left) == s.charAt(right)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        return s.substring(i, j);
    }

    private static Boolean res(int x) {
        if (x < 0) {
            return false;
        }
        return getRes(x) == x;
    }

    public static int getRes(int x) {
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getRes(1000000001));
        System.out.println(res(1000000001));
    }
}
