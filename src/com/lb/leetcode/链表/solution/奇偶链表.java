package com.lb.leetcode.链表.solution;

import com.lb.leetcode.链表.ListNode;
//给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
//
// 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
//
// 示例 1:
//
// 输入: 1->2->3->4->5->NULL
//输出: 1->3->5->2->4->NULL
//
//
// 示例 2:
//
// 输入: 2->1->3->5->6->4->7->NULL
//输出: 2->3->6->7->1->5->4->NULL
//
// 说明:
//
//
// 应当保持奇数节点和偶数节点的相对顺序。
// 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。

/**
 * @author liuben
 * @date 2021/6/5 1:19 下午
 **/
public class 奇偶链表 {

//    public static ListNode oddEvenList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//        ListNode dummy = head;
//        // 奇数部分的结束位置
//        ListNode oddPartEnd = head;
//        // 偶数部分的起始位置,一开始为第二个节点
//        ListNode evenPartStart = head.next;
//        // 偶数部分的结束位置,一开始也为第二个节点
//        ListNode evenPartEnd = head.next;
//
//        ListNode nextEvenNode;
//        ListNode nextOldNode;
//        while (head.next != null && head.next.next != null) {
//            // 存储下一个奇数节点
//            nextOldNode = head.next.next;
//            // 存储奇数节点的下一个偶数节点
//            nextEvenNode = nextOldNode.next;
//
//            // 将奇数部分的结束位置 的下一个节点 指向 之前存储的下一个奇数节点
//            oddPartEnd.next = nextOldNode;
//            // 将指针挪到新的奇数部分的结尾，用于下一次 加添加 新的奇数节点
//            oddPartEnd = oddPartEnd.next;
//
//            // 将奇数部分的结尾 指向 偶数部分的开头
//            oddPartEnd.next = evenPartStart;
//            // head指针指向 偶数部分的结尾
//            head = evenPartEnd;
//
//            // 偶数部分 添加偶数节点
//            evenPartEnd.next = nextEvenNode;
//            // 移动指针到最新的偶数部分结尾
//            evenPartEnd = evenPartEnd.next;
//        }
//        return dummy;
//    }

    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode evenHead = head.next;
        ListNode even = evenHead;
        while (even != null && even.next != null) {
           odd.next = even.next;
           odd = odd.next;
           even.next =odd.next;
           even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
//        ListNode node6 = new ListNode(1);
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        奇偶链表.oddEvenList(node1);

    }
}
