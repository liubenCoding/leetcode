package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

/**
 * @author liuben
 * @date 2021/5/30 12:31 下午
 **/
public class 反转链表 {
    //    public static ListNode reverseList(ListNode node) {
//        ListNode reversedList = null;
//        ListNode next = null;
//        while (node != null) {
//            // 暂存下一节点
//            next = node.getNext();
//            // 断开当前节点与之前下一节点的链接, 设置下一节点为上次缓存的值
//            node.setNext(reversedList);
//            // 缓存当前断开链接之后的当前节点
//            reversedList = node;
//            // 之前的下一节点，继续往下循环
//            node = next;
//        }
//        return reversedList;
//    }

    /**
     * 1.直入栈到最底层，返回尾节点，并保存每一次入栈之前的下一节点，方便赋值
     * 2.在出栈的时候,把 B->C 倒转为 C->B ,并切断B->C的链接
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        反转链表.reverseList(node1);
    }
}
