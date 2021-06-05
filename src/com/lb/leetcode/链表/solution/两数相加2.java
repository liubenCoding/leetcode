package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;

import java.util.Stack;
//给你两个 非空 链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储一位数字。将这两数相加会返回一个新的链表。
//
// 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
//
//
//
// 进阶：
//
// 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
//
//
//
// 示例：
//
// 输入：(7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
//输出：7 -> 8 -> 0 -> 7
//

/**
 * @author liuben
 * @date 2021/6/5 8:17 下午
 **/
public class 两数相加2 {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2.val);
            l2 = l2.next;
        }
        ListNode dummy = null;
        boolean carry = false;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int sum = (stack1.empty() ? 0 : stack1.pop()) + (stack2.empty() ? 0 : stack2.pop()) + (carry ? 1 : 0);
            ListNode curr = new ListNode(sum % 10);
            curr.next = dummy;
            dummy = curr;
            carry = sum >= 10;
        }
        if (carry) {
            ListNode curr = new ListNode(1);
            curr.next = dummy;
            dummy = curr;
        }
        return dummy;
    }

    public static void main(String[] args) {
//        ListNode node4 = new ListNode(3);
//        ListNode node3 = new ListNode(4, node4);
        ListNode node2 = new ListNode(9);
        ListNode node1 = new ListNode(9, node2);

//        ListNode nodec = new ListNode(4);
//        ListNode nodeb = new ListNode(6, nodec);
        ListNode nodea = new ListNode(1);

        两数相加2.addTwoNumbers(node1, nodea);
    }

}
