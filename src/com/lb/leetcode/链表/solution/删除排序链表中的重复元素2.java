package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;
//存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
//
// 返回同样按升序排列的结果链表。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,3,4,4,5]
//输出：[1,2,5]
//
//
// 示例 2：
//
//
//输入：head = [1,1,1,2,3]
//输出：[2,3]
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
// 👍 625 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class 删除排序链表中的重复元素2 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        ListNode dummyHead = dummy;
        // Set<Integer> duplicateVals = new HashSet<>();
        int duplicateVal = -101;
        while (head != null) {
            // if ((head.next != null && head.val == head.next.val) || duplicateVals.contains(head.val)) {
            if ((head.next != null && head.val == head.next.val) || duplicateVal == head.val) {
                // duplicateVals.add(head.val);
                duplicateVal = head.val;
            } else {
                dummy.next = new ListNode();
                dummy.next.val = head.val;
                dummy = dummy.next;
            }
            head = head.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
//        ListNode node7 = new ListNode(4);
//        ListNode node6 = new ListNode(3, node7);
//        ListNode node5 = new ListNode(3, node6);
//        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(2);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = 删除排序链表中的重复元素2.deleteDuplicates(node1);
        System.out.println(listNode);
    }
}
