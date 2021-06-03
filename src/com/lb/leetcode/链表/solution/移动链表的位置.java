package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;
//给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], k = 2
//输出：[4,5,1,2,3]
//
//
// 示例 2：
//
//
//输入：head = [0,1,2], k = 4
//输出：[2,0,1]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目在范围 [0, 500] 内
// -100 <= Node.val <= 100
// 0 <= k <= 2 * 109
//
// Related Topics 链表 双指针
// 👍 570 👎 0


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

/**
 * @author liuben
 * @date 2021/6/1 10:18 下午
 **/
public class 移动链表的位置 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        ListNode dummy = head;
        ListNode pre = null;
        int i = 0;
        int length = 1;
        while (true) {
            if (head.next != null) {
                pre = head;
                head = head.next;
                length++;
            } else {
                pre.next = null;
                head.next = dummy;
                dummy = head;
                i++;
                if (i == (k % length)) {
                    return head;
                }
            }
        }

    }
    public static void main(String[] args) {
//        ListNode node5 = new ListNode(5);
//        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(2);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(0, node2);
        ListNode listNode = 移动链表的位置.rotateRight(node1, 7);
        System.out.println(listNode);
    }
}
