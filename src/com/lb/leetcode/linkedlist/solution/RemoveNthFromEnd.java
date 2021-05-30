package com.lb.leetcode.linkedlist.solution;

//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 进阶：你能尝试使用一趟扫描实现吗？
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
//
//
// 示例 2：
//
//
//输入：head = [1], n = 1
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1,2], n = 1
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中结点的数目为 sz
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
// Related Topics 链表 双指针
// 👍 1389 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import com.lb.leetcode.linkedlist.ListNode;

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
public class RemoveNthFromEnd {

    private static int i = 0;
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n);
        i++;
        if (i == n) {
            return head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = RemoveNthFromEnd.removeNthFromEnd(node1, 2);
        System.out.println(listNode);
    }
}
