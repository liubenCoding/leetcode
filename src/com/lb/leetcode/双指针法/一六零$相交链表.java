package com.lb.leetcode.双指针法;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/8/21 4:23 下午
 **/
public class 一六零$相交链表 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA;
        boolean l1Flag = false;
        ListNode l2 = headB;
        boolean l2Flag = false;
        while (l1 != null && l2 != null && !l1.equals(l2)) {
            l1 = l1.next;
            l2 = l2.next;
            if (l1 == null && !l1Flag) {
                l1 = headB;
                l1Flag = true;
            }
            if (l2 == null && !l2Flag) {
                l2 = headA;
                l2Flag = true;
            }
        }
        return (l1 == null || l2 == null) ? null : l1;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(8, node4);
        ListNode node2 = new ListNode(1, node3);
        ListNode node1 = new ListNode(4, node2);

        ListNode nodeb = new ListNode(0);
        ListNode nodea = new ListNode(5, nodeb);
        System.out.println(一六零$相交链表.getIntersectionNode(node1,nodea));
    }
}
