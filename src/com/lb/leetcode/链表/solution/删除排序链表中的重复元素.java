package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;
//存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除所有重复的元素，使每个元素 只出现一次 。
//
// 返回同样按升序排列的结果链表。
//
//
//
// 示例 1：
//
//
//输入：head = [1,1,2]
//输出：[1,2]
//
//
// 示例 2：
//
//
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
//
//
//
//
// 提示：
//
//
// 链表中节点数目在范围 [0, 300] 内
// -100 <= Node.val <= 100
// 题目数据保证链表已经按升序排列
//
// Related Topics 链表
// 👍 579 👎 0
public class 删除排序链表中的重复元素 {
//    public static ListNode deleteDuplicates(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode dummy = head;
//        while (head != null && head.next != null) {
//            if (head.val == head.next.val) {
//                head.next = head.next.next;
//            }else{
//                head = head.next;
//            }
//        }
//        return dummy;
//    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head.next = deleteDuplicates(head.next);
        if (head.val == head.next.val) {
            return head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node7 = new ListNode(4);
        ListNode node6 = new ListNode(3, node7);
        ListNode node5 = new ListNode(3, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = 删除排序链表中的重复元素.deleteDuplicates(node1);
        System.out.println(listNode);
    }
}
