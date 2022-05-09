package com.demo.leecode.base.sort;

import java.util.Arrays;

/**
 *
 * 归并排序
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/9 21:18
 */
public class MergeSort {

    /**
     * 排序
     * @param arr
     * @param l
     * @param r
     */
    public static void mergeSort(int[] arr,int l,int r){
        if(l<r){
            int m = (l+r)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1, r);
            int[] temp = new int[arr.length];
            merge(arr,l,m,r,temp);
        }

    }

    /**
     * 合并算法
     *
     * @param arr
     * @param left
     * @param mid
     * @param right
     * @param temp
     */
    public static void merge(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;
        int j = mid+1;
        int t = 0;
        //條件繼續就是左指針必須小於等於中間指針
        while (i <= mid & j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            }else{
                temp[t++] = arr[j++];
            }
        }
        while( i <= mid){
            temp[t++] = arr[i++];
        }
        while( j <= right){
            temp[t++] = arr[j++];
        }

        t = 0;
        while( left <= right){
            arr[left++]=temp[t++];
        }
    }

    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,21,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
