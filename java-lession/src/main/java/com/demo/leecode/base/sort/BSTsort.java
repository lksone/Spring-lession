package com.demo.leecode.base.sort;

/**
 *
 * 二叉樹排序算法
 *
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 10:59
 */
public class BSTsort {




    public static void main(String[] args) {
        int[] array = new int[]{12,1,3,54,3,2};
        TreeNode root = new TreeNode();
        for (int i = 0; i < array.length; i++) {
            root.add(array[i]);
        }
        root.print();
    }
}
