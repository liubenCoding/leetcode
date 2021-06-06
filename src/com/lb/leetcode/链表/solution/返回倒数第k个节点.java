package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/6/6 11:16 上午
 **/
public class 返回倒数第k个节点 {

    public static int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k-- > 0) {
            fast = fast.next;
        }
        while (fast != null) {
             fast = fast.next;
             slow = slow.next;
        }
        return  slow.val;
    }

}
