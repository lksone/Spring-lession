package com.demo.leecode.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/21 11:17
 */
public class LeeCode0001 {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            int result = target - nums[i];
            //是否包含数据
            if (map.containsKey(result)) {
                arr[0] = map.get(result);
                arr[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
