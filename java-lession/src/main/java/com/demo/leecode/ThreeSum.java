package com.demo.leecode;

/**
 * @author lks
 * @describe
 *      答案中不可以包含重复的三元组
 *
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
 * 使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2020/10/19 15:44
 **/
public class ThreeSum {

    public String longestCommonPrefix(String[] str){
        StringBuilder sb = new StringBuilder();
        String minStr= null;
        for (int i = 0; i < str.length -1; i++) {
           minStr = str[i].length() > str[i+1].length()? str[i]:str[i+1];

        }
        return null;
    }

    public static void main(String[] args) {
    }


}
