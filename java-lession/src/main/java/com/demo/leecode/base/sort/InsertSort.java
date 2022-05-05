package com.demo.leecode.base.sort;

/**
 *
 * 插入排序
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/5 17:30
 */
public class InsertSort {


    /**
     * 插入排序
     *
     * @param arr
     */
    public static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //每次都是从后往前去弄的
            for (int j = i; j >0; j--) {
                if(arr[j] < arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    /**
     * swap交换项目
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void swap(int[] arr,int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void main(String[] args) {
       int[] arr = new int[]{12,12,43,54,2,1,3,2,5,22,12};
        InsertSort.sort(arr);
        for (int j : arr) {
            System.out.print(j);
            System.out.print(' ');
        }
    }
}
