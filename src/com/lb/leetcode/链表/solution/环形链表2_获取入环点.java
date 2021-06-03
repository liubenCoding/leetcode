package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/5/31 8:32 下午
 **/
public class 环形链表2_获取入环点 {

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow == fast) {
            fast = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return fast;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(-4);
        ListNode node3 = new ListNode(0, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(3, node2);
        node4.setNext(node2);
        环形链表2_获取入环点.detectCycle(node1);
    }
}
