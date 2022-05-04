package com.demo.leecode.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * leecode 两数之和
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 21:10
 */
public class TwoNumAdd {

    /**
     * 兩數之和
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[]  twoSum(int[] nums, int target) {
        int[] result= new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            //判断是否存在
            if(map.containsKey(nums[i])){
                //第一个数据
                result[0] = map.get(nums[i]);
                result[1] = i;
            }
            map.put(target - nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = new int[]{2,7,11,15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]+",");
        }
    }
}
