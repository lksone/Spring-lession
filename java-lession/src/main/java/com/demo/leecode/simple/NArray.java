package com.demo.leecode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/21 11:02
 */
public class NArray {

    public static int repeatedNTimes(int[] nums) {
        Set<Integer> found = new HashSet<Integer>();
        for (int num : nums) {
            if (!found.add(num)) {
                System.out.println(found.toArray());
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,1,1,2,3,2};
        int i = repeatedNTimes(nums);
        System.out.println(i);
    }
}
