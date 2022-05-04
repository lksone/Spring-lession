package com.demo.leecode.base.sort;

/**
 * leecode
 * 88. 合并两个有序数组
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 17:20
 */
public class TwoArraySort {

    /**
     * 合并两个数组
     * 這個不是太明白
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m+n -1 ;
        while (n > 0) {
            if (m > 0 && nums1[m-1] > nums2[n-1]) {
                nums1[--i] = nums1[--m];
                //替代swap，参考官方题解“逆向双指针解法”的公式
            }else{
                nums1[--i] = nums2[--n];
                //替代swap，参考官方题解“逆向双指针解法”的公式
            }
        }
    }

    /**
     * 雙指針的寫法
     *
     * @param nums1     数组1
     * @param m         有效个数
     * @param nums2     数组2
     * @param n         有效个数
     */
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p1  = 0;
        int p2 = 0;
        //当前存储的值
        int cur;
        int[] sortNum = new int[m+n];
        //循環截止条件
        while (p1 < m || p2 < n){
            if(p1==m){
                cur = nums2[p2++];
            }else if(p2==n){
                cur = nums1[p1++];
            } else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }else{
               cur = nums2[p2++];
            }
            //
            sortNum[p1+p2-1] = cur;
        }
        //将数据赋值到nums1中,這個情況行不通，只有當 0的数目和第二个数组的数目一致才行
        for (int i = 0; i != m + n; ++i) {
           nums1[i] = sortNum[i];
        }
    }

    /**
     * 最優解法？
     * 通過 逆向雙指针的方式获取到最优的解法，不需要额外的空间去处理数据
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
        int p1  = m-1;
        int p2 = n-1;
        int tail = m+n -1;
        int cur;
        while (p1>=0 || p2>=0){

            if(p1==m){
                cur = nums2[p2--];
            }else if(p2==n){
                cur = nums1[p1--];
            }else if(nums1[p1]>nums2[p2]){
                cur = nums1[p1--];
            }else{
                cur = nums2[p2--];
            }
            //将最大值放到最后面
            nums1[tail--] = cur;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int m = 3;
        int[] nums2 =new int[]{2,5,6};
        int n = 3;
      /*  merge2(nums1,m,nums2,n);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i]+",");
        }*/

        for (int i = 0; i < nums1.length;) {
            System.out.println(nums1[i++]+",");
        }
    }
}
