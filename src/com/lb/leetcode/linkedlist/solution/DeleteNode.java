package com.lb.leetcode.linkedlist.solution;

import com.lb.leetcode.linkedlist.ListNode;

/**
 * @author liuben
 * @date 2021/5/31 9:46 下午
 **/
public class DeleteNode {
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
        DeleteNode.deleteNode(node2);
        System.out.println("111");
    }
}
