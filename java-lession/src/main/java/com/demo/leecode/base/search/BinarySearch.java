package com.demo.leecode.base.search;

/**
 * 二分查询法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/8 23:30
 */
public class BinarySearch {

    /**
     * 二分法查找
     *
     * @param arr
     * @param val
     * @param l
     * @param r
     * @return 返回下标
     */
    public static int sort(int[] arr, int val, int l, int r) {
        if (arr == null) {
            return -1;
        }
        //循环
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] == val) {
                return m;
            } else if (arr[m] > val) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 9, 41, 369};
        int index = sort(arr,4,0,arr.length-1);
        System.out.println(index);
    }
}
