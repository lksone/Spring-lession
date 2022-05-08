package com.demo.leecode.base.sort;

import java.util.Arrays;

/**
 * 希尔排序
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/5 17:45
 */
public class ShellSort {


    /**
     * 排序算法
     * <p>
     * [1, 5, 2, 7, 12, 6, 15, 4, 3, 9, 8, 10]
     * [1, 4, 2, 7, 12, 6, 15, 5, 3, 9, 8, 10]
     * [1, 4, 2, 7, 12, 6, 15, 5, 3, 9, 8, 10]
     * [1, 4, 2, 7, 12, 6, 15, 5, 3, 9, 8, 10]
     * [1, 4, 2, 7, 8, 6, 15, 5, 3, 9, 12, 10]
     * [1, 4, 2, 7, 8, 6, 15, 5, 3, 9, 12, 10]
     * [1, 4, 2, 7, 8, 6, 15, 5, 3, 9, 12, 10]
     * [1, 4, 2, 7, 8, 6, 15, 5, 3, 9, 12, 10]
     * [1, 4, 2, 7, 8, 6, 15, 5, 3, 9, 12, 10]
     * [1, 4, 2, 7, 8, 6, 15, 5, 3, 9, 12, 10]
     * [1, 4, 2, 7, 5, 6, 15, 8, 3, 9, 12, 10]
     * [1, 4, 2, 7, 5, 3, 15, 8, 6, 9, 12, 10]
     * [1, 4, 2, 7, 5, 3, 9, 8, 6, 15, 12, 10]
     * [1, 4, 2, 7, 5, 3, 9, 8, 6, 15, 12, 10]
     * [1, 4, 2, 7, 5, 3, 9, 8, 6, 15, 12, 10]
     * [1, 4, 2, 7, 5, 3, 9, 8, 6, 15, 12, 10]
     * [1, 2, 4, 7, 5, 3, 9, 8, 6, 15, 12, 10]
     * [1, 2, 4, 7, 5, 3, 9, 8, 6, 15, 12, 10]
     * [1, 2, 4, 5, 7, 3, 9, 8, 6, 15, 12, 10]
     * [1, 2, 3, 4, 5, 7, 9, 8, 6, 15, 12, 10]
     * [1, 2, 3, 4, 5, 7, 9, 8, 6, 15, 12, 10]
     * [1, 2, 3, 4, 5, 7, 8, 9, 6, 15, 12, 10]
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 12, 10]
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 12, 10]
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 10]
     * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15]
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        int i;
        int j;
        int inc;
        int key;
        // 初始增量：len/2，每一趟之后除以二
        for (inc = arr.length / 2; inc > 0; inc /= 2) {
            // 每一趟采用插入排序
            for (i = inc; i < arr.length; i++) {
                //记住要比较的数据
                key = arr[i];
                //则是找到要比较的数据
                for (j = i; j >= inc && key < arr[j - inc]; j -= inc) {
                    arr[j] = arr[j - inc];
                    System.out.println(Arrays.toString(arr));
                }
                arr[j] = key;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("---------------------------------------------------------");
        }
    }

    public static void sort1(int[] arr) {
        //每次都是
        for (int inc = arr.length / 2; inc > 0; inc /= 2) {
            //插入操作
            for (int i = inc; i < arr.length; i++) {
                int key = arr[i];
                for (int j = i; j >= inc && key < arr[j - inc]; j -= inc) {
                    arr[j] = arr[j - inc];
                }
                arr[i] = key;
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{15, 5, 2, 7, 12, 6, 1, 4, 3, 9, 8, 10};
        System.out.println(Arrays.toString(arr));
        sort(arr);
    }
}
