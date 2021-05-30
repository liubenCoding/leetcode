package com.lb.leetcode.linkedlist.solution;

import com.lb.leetcode.linkedlist.ListNode;

/**
 * @author liuben
 * @date 2021/5/30 12:32 下午
 **/
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode curr = new ListNode();
        ListNode dummy = curr;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }else{
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            }
        }
        if(l1 != null){
            curr.next = l1;
        }
        if(l2 != null){
            curr.next = l2;
        }
        return dummy.next;
    }
}
