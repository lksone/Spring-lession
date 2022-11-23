package com.lks.algorithm.array;

public class Demo2 {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 2, 0, 4, 2};

        int i = removeElement2(arr, 2);
        System.out.println(i);

    }

    /**
     * 数据暴力删除
     *
     * @param arr
     * @param target
     * @
     *
     */
    public static int removeElement(int[] arr, int target) {
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                for (int j = i + 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
            }
            i--;    //
            size--; //余下的数据减掉1
        }
        return size;
    }

    /**
     * 双指针法
     *
     * 1、当fastIndex指针非等于target的时候就是lastIndex++和和数据交换的时候
     * @param arr
     * @param target
     * @return
     */
    public static int removeElement2(int[] arr, int target) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < arr.length; fastIndex++) {
            if (arr[fastIndex] != target) {
                arr[slowIndex] = arr[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }
}
