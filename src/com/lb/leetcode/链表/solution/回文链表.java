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
        ListNode dummy = head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode latterHalf = fast == null ? slow : slow.next;
        while (latterHalf != null) {
            latterHalf =
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        回文链表.isPalindrome(node1);
    }
}
