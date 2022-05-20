package com.demo.leecode.base.search;

/**
 * 二分查询法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/8 23:30
 */
public class BinarySearch {

    /**
     * 二分法查找
     *
     * @param arr
     * @param val
     * @param l
     * @param r
     * @return 返回下标
     */
    public static int sort(int[] arr, int val, int l, int r) {
        if (arr == null) {
            return -1;
        }
        //循环
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] == val) {
                return m;
            } else if (arr[m] > val) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        if(nums ==null || nums.length == 0){
            return -1;
        }
        int l =0;
        int h =nums.length -1;
        while(l<=h){
            int m = (l+h)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                l = m + 1;
            }else{
                h = m -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4};
        int index = search(arr,4);
        System.out.println(index);
    }
}
