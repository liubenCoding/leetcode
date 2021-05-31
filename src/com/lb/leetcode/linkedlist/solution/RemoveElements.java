package com.lb.leetcode.linkedlist.solution;

import com.lb.leetcode.linkedlist.ListNode;

/**
 * @author liuben
 * @date 2021/5/31 8:52 下午
 **/
public class RemoveElements {

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        }
        return head;
    }

}
