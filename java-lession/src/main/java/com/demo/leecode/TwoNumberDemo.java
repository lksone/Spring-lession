package com.demo.leecode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lks
 * @date 2020-10-06 15:51
 * @email 1056224715@qq.com
 * @Description 两数之和 等于目标数据target
 */
public class TwoNumberDemo {

    /**
     * 遍历暴力解法
     *
     * @param nums
     * @param target
     * @return
     */
    private static int[] getTwoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return temp;
    }


    private static int[] getTwoSumMap(int[] nums, int target) {
        int[] temp = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int source = target - nums[i];
            if (map.containsKey(source)) {
                temp[0] = map.get(source);
                temp[1] = i;
                return temp;
            } else {
                map.put(nums[i], i);
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] nums = {1, 23, 12, 34, 21, 3};
        /*int[] twoSum = getTwoSum(nums, 8);
        for (int i = 0; i < twoSum.length; i++) {
            System.out.println(twoSum[i]);
        }*/

        int[] twoSumMap = getTwoSumMap(nums, 4);
        for (int i = 0; i < twoSumMap.length; i++) {
            System.out.println(twoSumMap[i]);
        }
    }
}
