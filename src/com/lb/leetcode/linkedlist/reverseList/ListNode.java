package com.lb.leetcode.linkedlist.reverseList;

import javax.xml.soap.Node;

/**
 * @author liuben
 * @date 2021/5/29 7:32 下午
 **/
public class ListNode {
    private int val;

    private ListNode next;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     *循环：每次循环，最主要的是把当前节点断开之后节点的链接,和之后节点 缓存起来,用于后面的便利
     */
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
    public static ListNode reverseList(ListNode node) {
        if (node.getNext() == null) {
            return node;
        }
        // 最后一次方法入栈时,temp = 尾节点
        ListNode temp = node.getNext();
        // 直接一直入栈到最底层，返回最后尾节点
        ListNode newHead = reverseList(node.getNext());
        // 尾节点的上一节点 断开与尾节点的链接
        node.setNext(null);
        // 尾节点 设置下一节点为 之前 尾节点的上一节点
        temp.setNext(node);
        return newHead;
    }

    public static void main(String[] args) {
        ListNode node3 = new ListNode(3);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode.reverseList(node1);
    }
}