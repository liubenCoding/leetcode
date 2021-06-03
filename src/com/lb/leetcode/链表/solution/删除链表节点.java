package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/5/31 9:46 下午
 **/
public class 删除链表节点 {
    public static void deleteNode(ListNode head) {
        System.out.print(head.val);
//        head.val = head.next.val;
//        head.next = head.next.next;
        head = head.next;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        删除链表节点.deleteNode(node2);
        System.out.println("111");
    }
}
