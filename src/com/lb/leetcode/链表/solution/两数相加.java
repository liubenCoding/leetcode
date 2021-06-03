package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author: liuben
 * @date: 2021/6/2
 */
public class 两数相加 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode dummyHead = dummy;
        boolean carry = false;
        while (l1 != null && l2 != null) {
            dummy.next = new ListNode();
            dummy.next.val = (l1.val + l2.val + (carry ? 1 : 0)) % 10;
            carry = (l1.val + l2.val + (carry ? 1 : 0)) >= 10;
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null && l2 != null) {
                l1 = new ListNode();
                l1.val = 0;
            }
            if (l1 != null && l2 == null) {
                l2 = new ListNode();
                l2.val = 0;
            }
            if (l1 == null && l2 == null && carry) {
                dummy.next = new ListNode();
                dummy.next.val = 1;
            }
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(9);
        ListNode node2 = new ListNode(9, node3);
        ListNode node1 = new ListNode(9, node2);

        ListNode noded = new ListNode(9);
        ListNode nodec = new ListNode(9,noded);
        ListNode nodeb = new ListNode(9, nodec);
        ListNode nodea = new ListNode(9, nodeb);

        ListNode listNode = 两数相加.addTwoNumbers(node1, nodea);
        System.out.println(listNode);
    }


}
