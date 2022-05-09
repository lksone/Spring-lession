package com.demo.leecode.base.sort;

import java.util.Arrays;

/**
 * 选择排序
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/9 11:09
 */
public class ChoseSort {


    /**
     * 选择排序 非常之简单
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            //第一个值当做最小值
            int min = arr[i];
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //记住最小的值
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            //swap
            int tmp = min;
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3221, 1, 10, 9680, 577, 9420, 7, 5622, 4793, 2030, 3138, 82, 2599, 743, 4127};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
