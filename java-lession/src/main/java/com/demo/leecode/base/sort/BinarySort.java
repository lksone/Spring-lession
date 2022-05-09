package com.demo.leecode.base.sort;

import java.util.Arrays;

/**
 * 二分法排序
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/8 21:18
 */
public class BinarySort {


    /**
     * 二分法排序，其实就是折半插入函数，当数据排序后，通过二分法查询并且插入
     *
     * @param arr 元数据信息
     * @param n   項目信息      长度
     */
    public static void binarySort(int[] arr, int n) {
        int low, high, mid;
        int tmp;
        for (int i = 1; i < n; i++) {
            tmp = arr[i];
            low = 0;
            high = i - 1;
            //这里是在干什么？
            while (low <= high) {
                mid = (low + high) / 2;
                //当中间的值大于 tmp,那么高位值 -1？
                if (arr[mid] > tmp) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            //这里才是排序的地方， 如果当前的值
            for (int j = i - 1; j > high; j--) {
                arr[j + 1] = arr[j];
            }
            arr[high + 1] = tmp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 41, 369, 1, 2, 4, 5, 9};
        int n = 8;
        binarySort(a, n);
    }
}
