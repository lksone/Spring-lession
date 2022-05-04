package com.demo.leecode.base.search;

/**
 *
 * 二叉樹
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 10:44
 */
public class BSTSearch {

    /**
     * 二叉树排序
     * 1、結束節點判斷
     *
     * @param root
     * @param val
     */
    public static TreeNode search(TreeNode root, int val){
        if(root.val == val) {
            return root;
        }
        if(root ==null) {
            return null;
        }
        //如果當前節點大于子节点就查询
        if(root.val<val){
            return search(root.right,val);
        }else{
            return search(root.left,val);
        }
    }

    public static void main(String[] args) {

    }
}
