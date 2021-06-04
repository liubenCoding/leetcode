package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author: liuben
 * @date: 2021/6/4
 */
public class 二进制链表转整数 {

    private static int i = 0;

    //public static int getDecimalValue(ListNode head) {
    //    if (head == null) {
    //        return 0;
    //    }
    //    int result = getDecimalValue(head.next);
    //    return (int) (head.val * Math.pow(2, i++)) + result;
    //}

    public static int getDecimalValue(ListNode head) {
        ListNode curNode = head;
        int ans = 0;
        while (curNode != null) {
            ans = ans * 2 + curNode.val;
            curNode = curNode.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(1);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(1, node2);
        int decimalValue = 二进制链表转整数.getDecimalValue(node1);
        System.out.println(decimalValue);
    }

}
