package com.lb.leetcode.双指针法;

import com.lb.leetcode.链表.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 进阶：你能尝试使用一趟扫描实现吗？
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 * <p>
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 * <p>
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 *
 * @author liuben
 * @date 2021/8/21 3:08 下午
 **/
public class 十九$删除链表的倒数第N个节点 {
    static int i = 0;
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n);
        i++;
        if (i == n) {
           return head.next;
        }
        return head;
    }

    public static void main(String[] args) {
//        ListNode node5 = new ListNode(5);
//        ListNode node4 = new ListNode(4, node5);
//        ListNode node3 = new ListNode(3, node4);
//        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1);
        ListNode listNode = 十九$删除链表的倒数第N个节点.removeNthFromEnd(node1, 1);
        System.out.println(listNode);
    }

}
