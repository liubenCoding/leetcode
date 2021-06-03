package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;
//给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
//
// 你应当 保留 两个分区中每个节点的初始相对位置。
//
//
//
// 示例 1：
//
//
//输入：head = [1,4,3,2,5,2], x = 3
//输出：[1,2,2,4,3,5]
//
//
// 示例 2：
//
//
//输入：head = [2,1], x = 2
//输出：[1,2]
//
//
//
//
// 提示：
//
//
// 链表中节点的数目在范围 [0, 200] 内
// -100 <= Node.val <= 100
// -200 <= x <= 200
//
// Related Topics 链表 双指针

public class 分隔链表 {

    /**
     * 创建两个链表,一个链表维护 比x小的节点,一个维护比x大的节点
     * 对链表（a-b-c）进行遍历,当节点 a<x,取出节点a(不包含b-c),存入lessThanNode,然后移动两个链表的指针到下一位。
     *
     */
    public static ListNode partition(ListNode head, int x) {
        ListNode lessThanNode = new ListNode();
        ListNode lessThanNodeHead = lessThanNode;
        ListNode moreThanNode = new ListNode();
        ListNode moreThanNodeHead = moreThanNode;
        while (head != null) {
            ListNode nextNode = head.next;
            head.next = null;
            if (head.val < x) {
                lessThanNode.next = head;
                lessThanNode = lessThanNode.next;
            } else {
                moreThanNode.next = head;
                moreThanNode = moreThanNode.next;
            }
            head = nextNode;
        }
        lessThanNode.next = moreThanNodeHead.next;
        return lessThanNodeHead.next;
    }

    public static void main(String[] args) {
        ListNode node6 = new ListNode(2);
        ListNode node5 = new ListNode(5, node6);
        ListNode node4 = new ListNode(2, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(4, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = 分隔链表.partition(node1, 3);
        System.out.println(listNode);
    }

}
