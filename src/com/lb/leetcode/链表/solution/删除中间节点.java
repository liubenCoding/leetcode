package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/6/6 11:40 上午
 **/
public class 删除中间节点 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
