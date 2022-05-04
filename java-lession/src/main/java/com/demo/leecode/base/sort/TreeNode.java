package com.demo.leecode.base.sort;

/**
 *
 * 树形结构
 * @author lks
 * @E-mail 1056224715@qq.com.
 * @Since 1.0
 * @Date 2022/5/4 10:42
 */
public class TreeNode {

    private Node root;

    /**
     * 节点添加数据
     * @param data
     */
    public void add(int data) {
        if (root==null) {
            root=new Node(data);
        }else {
            root.add(data);
        }


    }

    /**
     * 打印日志
     */
    public void print() {
        root.printNode();
        System.out.println();

    }

    class Node{
        int val;
        Node left;
        Node right;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        /**
         * 打印出数据信息
         */
        public void printNode(){
            if (this.left!=null) {
                this.left.printNode();

            }
            System.out.print(this.val+"-->");
            if (this.right!=null) {
                this.right.printNode();

            }

        }

        /**
         * 添加数据信息
         *
         * @param val
         */
        public void add(int val) {
            if(root == null){
                root= new Node(val);
            }else{
                if(this.val<val){
                    if(this.right ==null){
                        this.right = new Node(val);
                    }else {
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

}
