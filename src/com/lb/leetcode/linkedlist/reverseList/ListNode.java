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


//    public static ListNode reverseList(ListNode node) {
//        ListNode pre = null;
//        ListNode next = null;
//        while (node != null) {
//            next = node.getNext();
//            node.setNext(pre);
//            pre = node;
//            node = next;
//        }
//        return next;
//    }

    public static ListNode reverseList(ListNode node) {
        if (node.getNext() == null) {
            return node;
        }
        ListNode temp = node.getNext();
        ListNode newHead = reverseList(node.getNext());
        node.setNext(null);
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