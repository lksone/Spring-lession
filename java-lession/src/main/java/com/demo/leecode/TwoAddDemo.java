package com.demo.leecode;

/**
 * @author lks
 * @date 2020-10-06 21:08
 * @email 1056224715@qq.com
 * @Description 两数相加
 *
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class TwoAddDemo {

    /**
     * 当前节点类，就是将自己的值存入按照  位计算小数的方法获取数据
     */
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }

        public static String print(ListNode l){
            StringBuffer sb = new StringBuffer();
            while (l!=null){
                sb.append(l.val);
                l=l.next;
            }
            return sb.toString();
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        // 结果node头节点
        ListNode root = new ListNode(0);
        ListNode custor = root;
        int carray = 0;
        while (l1 != null || l2 != null || carray != 0) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            //总和为 l1+l2 + carry
            int sum = n1 + n2 + carray;
            //进位数据
            carray = sum / 10;
            // 计算当前数据的第一位
            custor.next =  new ListNode(sum % 10);
            //指针向前走一位
            custor = custor.next;
            //判断下一个节点是否为空，不为空的话，向前进一位
            if (l1 != null)l1 = l1.next;
            //判断第二个计算的数是否为空，不为空的话走下一个节点
            if(l2!=null) l2 = l2.next;
        }
        return root.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(5);

        l1.next = new ListNode(4);
        l2.next = new ListNode(6);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(ListNode.print(listNode));

    }
}
