package com.demo.leecode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/21 14:41
 */
public class LeeCode0094 {

    /**
     * 中序排序输出，
     * <p>
     * 先遍历左子数后面遍历右子树
     *
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    public static void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
    }
}
