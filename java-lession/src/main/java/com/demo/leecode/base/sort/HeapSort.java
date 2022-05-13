package com.demo.leecode.base.sort;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/13 11:02
 */
public class HeapSort {

    /**
     * 交换数据
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * 对已排好的堆进行排序
     *
     * @param arr 数组
     * @param n   数组中一共有多少个
     * @param i   针对的数据n
     */
    public static void heapily(int[] arr, int n, int i) {
        if(i>=n) {
            return;
        }
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        //如果左边的值大于最大值，那么就交换位置
        if (c1 < n && arr[c1] > arr[max]) {
            max = c1;
        }
        //如果c2的值大於就替換掉
        if (c2 < n && arr[c2] > arr[max]) {
            max = c2;
        }
        //什麼時候一直調用呢？当数据没有交换到最大的那个
        if(max!=i){
            swap(arr,max,i);
            heapily(arr,n,max);
        }
    }


    /**
     * 构建函数
     * @param arr
     * @param n
     */
    public static void buildHeap(int[] arr){
        //最后一个index
        int lastNode = arr.length-1;
        //父类数据
        int parent = (lastNode -1) /2;
        //循环查找一个parent的数据信息
        for (int j =parent ; j >=0 ; j--) {
            heapily(arr,arr.length,j);
        }
    }

    /**
     * 堆排序
     * @param arr
     * @param n
     */
    public static void heapSort(int[] arr){
        buildHeap(arr);
        for (int i = arr.length -1; i >=0; i--) {
            swap(arr,i,0);
            heapily(arr,i,0);
        }
    }

    public static void main(String[] args) {
        int[] tree =new int[]{10,5,8,3,4,6,7,1,2,21};
        buildHeap(tree);
        System.out.println(Arrays.toString(tree));
    }
}
