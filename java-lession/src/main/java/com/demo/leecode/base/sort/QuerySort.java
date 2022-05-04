package com.demo.leecode.base.sort;

import java.util.Arrays;

/**
 *
 * 快速排序的算法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 21:47
 */
public class QuerySort {


    /**
     * 排序
     *
     * @param arr       原生 数组
     * @param left      左
     * @param right     右
     * @return          排序
     */
    public static int partition(int[] arr,int left,int right){
        //选取第一个数据为基准
        int point= arr[left];
        //判断左边的值和右边的值不能够相同
        while (left<right){
            //从左到右排序，遇到小于point的数据就会导致一些问题
            while (left < right && arr[right] >=point){
                right --;
            }
            //记录小于point的值
            arr[left] = arr[right];

            //如果左边的值小于基准值
            while (left<right && arr[left] <= point){
                left++;
            }
            arr[right] = arr[left];
        }
        // 记录基准元素到当前指针指向的区域
        arr[left] = point;
        // 返回基准元素的索引
        return left;
    }

    /**
     * 快速排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void quickSort(int[] arr, int left, int right){
        if (left < right){
            // 把数组分块
            int pivot = partition(arr, left, right);
            System.out.println(Arrays.toString(arr));
            // 基准元素左边递归
            quickSort(arr, left, pivot-1);
            // 基准元素右边递归
            quickSort(arr, pivot+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {8,9,1,7,2,3,5,4,6,0};
        quickSort(arr,0,arr.length-1);
    }
}
