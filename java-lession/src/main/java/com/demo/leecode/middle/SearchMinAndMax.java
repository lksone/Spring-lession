package com.demo.leecode.middle;

/**
 *
 * 细节怪 二分法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/21 00:24
 */
public class SearchMinAndMax {

    /**
     * 查询数据信息，指定数据信息
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int l=0,r=nums.length;
        while(l<r){
            int mid=(r+l)>>1;
            if(nums[mid]>=target) {
                r=mid;
            } else {
                l=mid+1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 4, 4, 4, 6, 6, 7, 7};
        int target = 4;
        //查询只当
        int left = search(arr,target);
        int right = search(arr,target+1);
        System.out.println(right);
    }
}
