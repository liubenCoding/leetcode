package com.lb.leetcode.linkedlist.solution;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * 示例 1：
 * 输入：head = [1,2,3,4]
 * 输出：[2,1,4,3]
 * 示例 2：
 * 输入：head = []
 * 输出：[]
 * 示例 3：
 * 输入：head = [1]
 * 输出：[1]
 * 提示：
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 * 进阶：你能在不修改链表节点值的情况下解决这个问题吗?（也就是说，仅修改节点本身。）
 * Related Topics 递归 链表
 * 👍 929 👎 0
 */

import com.lb.leetcode.linkedlist.ListNode;
import sun.java2d.pipe.SpanIterator;

public class SwapPairs {

    /**
     * 迭代法
     *
     * @param args
     */
    //public static ListNode swapPairs(ListNode head) {
    //    ListNode dummy = new ListNode();
    //    dummy.next = head;
    //    ListNode dummyHead = dummy;
    //    ListNode nextNode;
    //    ListNode nextNextNode;
    //    while (dummy.next != null && dummy.next.next != null) {
    //        nextNode = dummy.next;
    //        nextNextNode = dummy.next.next;
    //        nextNode.next = nextNextNode.next;
    //        nextNextNode.next = dummy.next;
    //        dummy.next = nextNextNode;
    //        dummy = dummy.next.next;
    //    }
    //    return dummyHead.next;
    //}

    public static ListNode swapPairs(ListNode head) {
        //终止条件：链表只剩一个节点或者没节点了，没得交换了。返回的是已经处理好的链表
        if(head == null || head.next == null){
            return head;
        }
        //一共三个节点:head, next, swapPairs(next.next)
        //下面的任务便是交换这3个节点中的前两个节点
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        //根据第二步：返回给上一级的是当前已经完成交换后，即处理好了的链表部分
        return next;
    }
    public static void main(String[] args) {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode listNode = SwapPairs.swapPairs(node1);
        System.out.println(listNode);
    }

}
