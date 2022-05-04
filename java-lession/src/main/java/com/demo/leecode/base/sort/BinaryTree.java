package com.demo.leecode.base.sort;

/**
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 15:10
 */
public class BinaryTree {

    private Node root;

    /**
     * 添加参数
     *
     * @param val
     */
    public void add(int val){
        if(root ==null){
            root = new Node(val);
        }else{
            root.add(val);
        }

    }

    class Node{
        private int val;

        private Node left;

        private Node right;

        public Node(int val){
            this.val = val;
        }

        /**
         * 新增
         * @param val
         */
        public void add(int val){
            if(this.val< val){
                if(this.right ==null){
                    this.right = new Node(val);
                }else{
                    this.right.add(val);
                }
            }else if(this.val > val){
                if(this.left ==null){
                    this.left = new Node(val);
                }else{
                    this.left.add(val);
                }
            }
        }
    }
}
