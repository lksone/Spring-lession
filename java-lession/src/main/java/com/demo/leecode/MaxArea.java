package com.demo.leecode;

/**
 * @author lks
 * @describe 获取最大的面积
 * @date 2020/10/19 14:30
 **/
public class MaxArea {

    /**
     *  最长数据和最短的数据
     * @param height
     * @return
     */
    private int getMaxArea(int[] height) {
        int maxArea = 0, left = 0;
        int right = height.length - 1;
        while (left < right) {
            //获取最短height中的最短的值
            maxArea = (right - left) * Math.min(height[left], height[right]) > maxArea ? (right - left) * Math.min(height[left], height[right]) : maxArea;
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
    }
}
