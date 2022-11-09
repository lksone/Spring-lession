package com.lks.algorithm.array;

import java.util.Vector;

public class Demo1 {


    public static void main(String[] args) {
     /*   Integer[] arr = {123, 34, 2, 3, 45, 26, 32, 55, 31};
        Vector<Integer> objects = new Vector<>();
        objects.addAll(Arrays.asList(arr));
        System.out.println(objects.toArray());
        int search = search(objects, 45);
        System.out.println(search);*/

        System.out.println(2 >> 1);
    }

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


}
