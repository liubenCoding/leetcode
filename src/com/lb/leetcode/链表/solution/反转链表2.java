package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

//给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。请你反转从位置 left 到位置 right 的链
//表节点，返回 反转后的链表 。
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], left = 2, right = 4
//输出：[1,4,3,2,5]
//
//
// 示例 2：
//
//
//输入：head = [5], left = 1, right = 1
//输出：[5]
//
//
//
//
// 提示：
//
//
// 链表中节点数目为 n
// 1 <= n <= 500
// -500 <= Node.val <= 500
// 1 <= left <= right <= n
//
//
//
//
// 进阶： 你可以使用一趟扫描完成反转吗？
public class 反转链表2 {

    /**
     * 到了需要反转的节点,对left 到right之间的节点 反转, 记录下left-1的初始节点,
     * 到达right+1节点后, left -1 接上 left到right的反转结果,再接上 right+1
     */
    //public static ListNode reverseBetween(ListNode head, int left, int right) {
    //    if (head == null || head.next == null || left == right) {
    //        return head;
    //    }
    //    ListNode dummy = new ListNode();
    //    ListNode dummyNode = dummy;
    //    dummy.next = head;
    //    int index = -1;
    //    ListNode reversedNode = null;
    //    ListNode reversedEnd = null;
    //    ListNode next = null;
    //    ListNode pre = null;
    //    while (dummy != null) {
    //        index++;
    //        if (index == left - 1) {
    //            pre = dummy;
    //            dummy = dummy.next;
    //        } else if (index >= left && index <= right) {
    //            if (index == left) {
    //                reversedEnd = dummy;
    //            }
    //            next = dummy.next;
    //            dummy.next = reversedNode;
    //            reversedNode = dummy;
    //            pre.next = reversedNode;
    //            dummy = next;
    //        } else if (index == right + 1) {
    //            reversedEnd.next = dummy;
    //            break;
    //        } else {
    //            dummy = dummy.next;
    //        }
    //    }
    //    return dummyNode.next;
    //}
    public static ListNode reverseBetween(ListNode head, int left, int right) {
//        ListNode dummy = new ListNode();
//        dummy.next = head;
//        ListNode curr = dummy;
//        for (int i = 0; i < left; i++) {
//            curr = dummy.next;
//        }
//        ListNode pre = curr.next;
//        for (int i = left; i <= right; i++) {
//
//        }
        return null;
    }

    public static void main(String[] args) {
        //ListNode node6 = new ListNode(6);
        //ListNode node5 = new ListNode(5, node6);
        //ListNode node4 = new ListNode(4, node5);
        //ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(5);
        ListNode node1 = new ListNode(3, node2);
        反转链表2.reverseBetween(node1, 1, 2);
    }

}
