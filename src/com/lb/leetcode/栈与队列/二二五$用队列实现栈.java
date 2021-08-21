package com.lb.leetcode.栈与队列;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author liuben
 * @date 2021/8/21 9:48 下午
 **/
public class 二二五$用队列实现栈 {
    Queue<Integer> queue1 = new ArrayDeque<>();
//    Queue<Integer> queue2 = new ArrayDeque<>();

//    public void push(int x) {
//        queue2.offer(x);
//        while (!queue1.isEmpty()) {
//            queue2.offer(queue1.poll());
//        }
//        Queue<Integer> temp = queue1;
//        queue1 = queue2;
//        queue2 = temp;
//    }
//
//    public void push(int x) {
//
//        push
//    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue1.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue1.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue1.isEmpty();
    }

}
