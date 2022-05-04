package com.demo.leecode.base;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/3 22:40
 */
public class BubbleSort {

    /**
     * 冒泡排序
     *
     *    int[] array = new int[]{12,1,23,43,12,3,4,5,6,7,9};
     *
     * 1,12,23,12,3,4,5,6,7,9,43,
     * 1,12,12,3,4,5,6,7,9,23,43,
     * 1,12,3,4,5,6,7,9,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     * 問題：已經排序的方法還是有多餘的空間
     * @param array
     */
    public static void sort(int[] array){
        if(array ==null || array.length <2){
            return;
        }
        //循環 n - 1次
        for (int i = 0; i < array.length -1; i++) {
            //每次重頭開始，少一次，最外層少一次
            for (int j = 0; j < array.length - 1 -i; j++) {
                //左右調換，最右邊的值最大
               if(array[j]>array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
            }
            //每次都打印出数组的排序情况
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+",");
            }
            System.out.println();
        }
    }


    /**
     * 优化版本
     *
     * 如果已经排序的版本不需要继续排序
     *    int[] array = new int[]{12,1,23,43,12,3,4,5,6,7,9};
     *
     * 1,12,23,12,3,4,5,6,7,9,43,
     * 1,12,12,3,4,5,6,7,9,23,43,
     * 1,12,3,4,5,6,7,9,12,23,43,
     * 1,3,4,5,6,7,9,12,12,23,43,
     *
     * @param array
     */
    public static void sort1(int[] array){
        if(array ==null || array.length <2){
            return;
        }
        //循環 n - 1次
        for (int i = 0; i < array.length -1; i++) {
            //每次重頭開始，少一次，最外層少一次
            boolean sortFlag = true;
            for (int j = 0; j < array.length - 1 -i; j++) {
                //左右調換，最右邊的值最大
                if(array[j]>array[j+1]){
                    //如果有交换的话就不能够替换
                    sortFlag = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
            if(sortFlag) {
                break;
            }
            //每次都打印出数组的排序情况
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+",");
            }
            System.out.println();
        }
    }

    /**
     * 继续优化
     * 如果前面數字沒有順序，後面的數字有順序的話那麼
     *  int[] array = new int[]{12,1,23,43,12,45,46,47,48,49};
     * 原生数组
     * 1,12,23,12,43,45,46,47,48,49,
     * 1,12,12,23,43,45,46,47,48,49,
     * 記住
     * @param array
     */
    public static void sort2(int[] array){
        if(array ==null || array.length <2){
            return;
        }
        int lastExchangeIndex = 0;
        //每次比較只需要比較到這裡就可以,其實這個值就是 最後交換長度的位置
        int sortBorder = array.length - 1;
        //循環 n - 1次
        for (int i = 0; i < array.length -1; i++) {
            //每次重頭開始，少一次，最外層少一次
            boolean sortFlag = true;
            //如果值得大小直接小于最大值呢
            for (int j = 0; j < sortBorder; j++) {
                //左右調換，最右邊的值最大
                if(array[j]> array[j+1]){
                    //如果有交换的话就不能够替换
                    sortFlag = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    //調換就表示最後一個參數衛
                    lastExchangeIndex = j;
                }

            }
            //每次裡面的循環次數
            sortBorder = lastExchangeIndex;
            if(sortFlag) {
                break;
            }
            //每次都打印出数组的排序情况
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j]+",");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{12,1,23,43,12,45,46,47,48,49};
        sort2(array);
    }
}
