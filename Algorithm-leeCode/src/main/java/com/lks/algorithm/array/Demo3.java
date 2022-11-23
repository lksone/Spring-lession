package com.lks.algorithm.array;


/**
 * 有序数组的平方
 * <p>
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * 示例 1： 输入：nums = [-4,-1,0,3,10] 输出：[0,1,9,16,100] 解释：平方后，数组变为 [16,1,0,9,100]，排序后，数组变为 [0,1,9,16,100]
 * <p>
 * 示例 2： 输入：nums = [-7,-3,2,3,11] 输出：[4,9,9,49,121]
 */
public class Demo3 {

    public static int[] getNumber(int[] arr){
        int length = arr.length;
        int left =0;
        int right =length -1;
        int[] arrNew =new int[length];
        int count = length - 1;
        while (left<right){
           int leftDu =  arr[left] * arr[left];
           int rightDu = arr[right] * arr[right];
           if(leftDu < rightDu){
               arrNew[count--] = rightDu;
               right--;
           }else{
               arrNew[count--] = leftDu;
               left++;
           }
        }
        return arrNew;
    }
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] number = getNumber(nums);
        for (int a:number) {
            System.out.println(a);
        }

    }
}
