package com.demo.leecode.base;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/6/16 19:32
 */
public class LevelOrder {


    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  ret = new ArrayList<>();
        dfs(0, root,ret);
        return ret;
    }

    /**
     * 广度优先级
     *
     * @param depth
     * @param root
     */
    private void dfs(int depth, TreeNode root,List<List<Integer>>  ret) {
        if (root == null) {
            return;
        }
        //当深度和大小一样大的时候
        if (ret.size() == depth) {
            ret.add(new ArrayList<>());
        }
        ret.get(depth).add(root.val);
        dfs(depth + 1, root.left,ret);
        dfs(depth + 1, root.right,ret);
    }

    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root != null) {
            queue.add(root);
        }
        while(!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for(int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }

     public int getVal() {
         return val;
     }

     public void setVal(int val) {
         this.val = val;
     }

     public TreeNode getLeft() {
         return left;
     }

     public void setLeft(TreeNode left) {
         this.left = left;
     }

     public TreeNode getRight() {
         return right;
     }

     public void setRight(TreeNode right) {
         this.right = right;
     }
 }