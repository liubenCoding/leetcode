package com.lb.leetcode.链表.solution;

//请判断一个链表是否为回文链表。
//
// 示例 1:
//
// 输入: 1->2
//输出: false
//
// 示例 2:
//
// 输入: 1->2->2->1
//输出: true
//
//
// 进阶：
//你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？

import com.lb.leetcode.链表.ListNode;

public class 回文链表 {

    public static boolean isPalindrome(ListNode head) {

        ListNode firstHalfEnd = endOfFirstHalf(head);

        ListNode reversedLatterHalf = reverse(firstHalfEnd.next);
        ListNode p1 = head;
        ListNode p2 = reversedLatterHalf;
        boolean result = true;
        while (p2 != null) {
            if (p2.val != p1.val) {
                result = false;
            }
            p2 = p2.next;
            p1 = p1.next;
        }
        reverse(reversedLatterHalf);
        return result;
    }

    private static ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static ListNode reverse(ListNode listNode) {
        ListNode reversedLatterHalf = null;
        ListNode next = null;
        while (listNode != null) {
            next = listNode.next;
            listNode.next = reversedLatterHalf;
            reversedLatterHalf = listNode;
            listNode = next;
        }
        return reversedLatterHalf;
    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(1);
        ListNode node5 = new ListNode(2, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        回文链表.isPalindrome(node1);
    }
}
