package com.lb.leetcode.栈与队列.base;

/**
 * @author liuben
 * @date 2021/8/21 8:16 下午
 **/
public interface Stack {


    /**
     * Push element x to the back of queue.
     */
    public void push(int x);

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop();

    /**
     * Get the front element.
     */
    public int peek();

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty();
}