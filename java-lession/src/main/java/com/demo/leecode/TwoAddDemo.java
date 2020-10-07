package com.demo.leecode;

/**
 * @author lks
 * @date 2020-10-06 21:08
 * @email 1056224715@qq.com
 * @Description 两数相加
 */
public class TwoAddDemo {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        ListNode root = new ListNode(0);
        ListNode custor = root;
        int carray = 0;
        while (l1 != null || l2 != null || carray != 0) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            //总和为 l1+l2 + carry
            int sum = n1 + n2 + carray;
            //近卫数
            carray = sum / 10;
            // 这个是和个位
            ListNode sumNode = new ListNode(sum % 10);
            // 指定位置
            custor.next = sumNode;
            custor = sumNode;
            if (l1 != null) {
                l1.next = 
            }
        }
    }

    public static void main(String[] args) {

    }
}
