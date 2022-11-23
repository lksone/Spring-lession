package com.lks.algorithm.array;

import java.util.Vector;

public class Demo1 {

    /**
     * 左闭右闭
     *
     * @param list   目标arr
     * @param target 目标值
     * @return
     */
    private static int search(Vector<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            //获取中位数，防止溢出
            int middle = left + (right - left) / 2;
            if (list.get(middle) > target) {
                right = middle - 1;
            } else if (list.get(middle) < left) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 左闭右开区间
     *
     * @param list
     * @param target
     * @return
     */
    private static int search2(Vector<Integer> list, int target) {
        int left = 0;
        int right = list.size();
        while (left < right) {
            //1、
            int middle = left + ((right - left) >> 1);
            if (list.get(middle) < target) {
                left = middle + 1;
            } else if (list.get(middle) > target) {
                right = middle;
            } else {
                return middle;
            }
        }
        return -1;
    }

    /**
     * 文件删除element 暴力解法
     *
     * @param arr
     * @param target
     * @return
     */
    private static int removeElement(int[] arr, int target) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            //如果发现有一个数据添加，那么直接将后面的数据向前移动一位
            if (arr[i] == target) {
                for (int j = i + 1; j < size; j++) {
                    arr[j - 1] = arr[j];
                }
                //
                i--;
                //余下有大小为多少
                size--;
            }
        }
        return size;
    }
    public static void main(String[] args) {
       /* Integer[] arr = {123, 34, 2, 3, 45, 26, 32, 55, 31};
        Vector<Integer> objects = new Vector<>();
        objects.addAll(Arrays.asList(arr));
        System.out.println(objects.toArray());
        int search = search(objects, 45);
        System.out.println(search);*/

        int[] arr2 = {123, 34, 2, 3, 45, 26, 32, 55, 31};
        int i = removeElement(arr2, 123);
        System.out.println(i);

    }

}
