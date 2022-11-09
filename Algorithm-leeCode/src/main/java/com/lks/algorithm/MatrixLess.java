package com.lks.algorithm;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 矩阵中战斗力最弱的k行
 * <p>
 * 步骤💨💨
 * <p>
 * 首先我们创建一个Node类，里面有两个值，分别为i和count，i为数组的行数，count为此行内1的个数。
 * 接着创建一个ci数组，为Node[]类型。
 * 接着遍历数组，将他的行下标i和1的个数count存储在ci数组。
 * 由于是top-k问题，我们创建一个堆，创建堆时，我们要自己写比较器。
 * 接着把ci数组的值添加到堆中，接着我们一次出堆即可。
 * <p>
 * ————————————————
 * 版权声明：本文为CSDN博主「阿拉蕾wjh」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_64130230/article/details/124090113
 */


public class MatrixLess {


    public static int[] workRow(int[][] targetInt, int length) {
        //1、一共有多少行
        //我要输出的数组值
        int[] ret = new int[length];

        Node[] ci = new Node[targetInt.length];
        for (int i = 0; i < targetInt.length; i++) {
            int count = 0;
            for (int j = 0; j < targetInt[i].length; j++) {
                if (targetInt[i][j] == 1) {
                    count++;
                } else {
                    //减少循环次数
                    break;
                }
            }
            ci[i] = new Node(i, count);
        }
        //2、队列node
        PriorityQueue<Node> queue = new PriorityQueue<>(length, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                //如果value值不相同，比较value，相同，比较key值大小
                if (o1.val != o2.val) {
                    return o1.val - o2.val;
                } else {
                    return o1.key - o2.key;
                }
            }
        });
        //3、循环获取数据信息
        for (Node x : ci) {
            queue.offer(x);
        }
        //4、循环去除
        //4、将获取的数据输出
        for (int i = 0; i < length; i++) {
            ret[i] = queue.poll().key;
        }
        return ret;
    }

    /**
     * @param mat
     * @param k
     * @return
     */
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] ret = new int[k];
        //行數
        Node[] ci = new Node[mat.length];
        //1、行循環數據
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            //列循环
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            //将数据添加node中的数据中
            ci[i] = new Node(i, count);
        }

        //2、優先隊列，自定義比較函數
        PriorityQueue<Node> queue = new PriorityQueue<>(k, new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                //队列数据两两比较
                if (o1.val != o2.val) {
                    return o1.val - o2.val;
                } else {
                    return o1.key - o2.key;
                }
            }
        });
        //3、循环获取数据信息
        for (Node x : ci) {
            queue.offer(x);
        }
        //4、将获取的数据输出
        for (int i = 0; i < k; i++) {
            ret[i] = queue.poll().key;
        }
        return ret;
    }


    public static void main(String[] args) {
        int[][] arr =
                {
                    {1,1,0,0,0},
                    {1,1,1,1,0},
                    {1,0,0,0,0},
                    {1,1,0,0,0},
                    {1,1,1,1,1}
                };
        int[] weakestRows = kWeakestRows(arr, 3);
        for (int a : weakestRows) {
            System.out.println(a);
        }
    }
}

/**
 * 用于记录
 */
class Node {
    int key;
    int val;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }

}
