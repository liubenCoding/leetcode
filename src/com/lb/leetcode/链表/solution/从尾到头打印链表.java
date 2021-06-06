package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/6/5 10:03 下午
 **/
public class 从尾到头打印链表 {

    public static int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        int length = 0;
        ListNode dummy = head;
        while (head != null) {
            length++;
            head = head.next;
        }
        int[] res = new int[length];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = dummy.val;
            dummy = dummy.next;
        }
        return res;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        int[] ints = 从尾到头打印链表.reversePrint(node1);
        System.out.println(ints);
    }
}
