package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/5/31 8:52 下午
 **/
public class 删除链表中值为n的节点 {

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
