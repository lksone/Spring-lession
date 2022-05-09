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
     * 将第一个元素标记为已排序
     *
     * 对于每一个未排序的元素 X
     *
     *   “提取” 元素 X
     *
     *   i = 最后排序过元素的索引 到 0 的遍历
     *
     *     如果当前元素 j > X
     *
     *       将排序过的元素向右移一格
     *
     *     跳出循环并在此插入 X
     *
     * @param arr
     */
    public static void sort(int[] arr){
        //循环次数，从头到尾
        for (int i = 0; i < arr.length; i++) {
            //每次都是从后往前去弄的，每次排序都是按照已经排序好的顺寻进行
            for (int j = i; j >0; j--) {
                //判断如果后面的数比前面的数据就交换位置，
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
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    /**
     * 插入排序
     * @param arr
     */
    public static void method(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //倒叙排列
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{12, 12, 43, 54, 2, 1, 3, 2, 5, 22, 12};
        InsertSort.sort(arr);
        for (int j : arr) {
            System.out.print(j);
            System.out.print(' ');
        }
    }
}
