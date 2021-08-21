package com.lb.leetcode.双指针法;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/8/21 2:16 下午
 **/
public class 反转链表 {

//    public static ListNode reverseList(ListNode head) {
//        ListNode dummy = null;
////        ListNode dummyHead = dummy;
//        ListNode prev;
//        while (head != null) {
//            prev = head.next;
//            head.next = dummy;
//            dummy =  head;
//            head = prev;
//        }
//        return dummy;
//    }

    public static ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode prev = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return prev;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = 反转链表.reverseList(node1);
        System.out.println(listNode);
    }

}
