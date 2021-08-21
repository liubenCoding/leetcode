package com.lb.leetcode.栈与队列;

import java.util.Queue;
import java.util.Stack;

/**
 * @author liuben
 * @date 2021/8/21 8:15 下午
 **/
public class 二三二$用栈实现队列 implements com.lb.leetcode.栈与队列.base.Queue {

    Stack<Integer> pushStack = new Stack<>();
    Stack<Integer> popStack = new Stack<>();

    @Override
    public void push(int x) {
//        while (!popStack.isEmpty()) {
//            Integer pop = popStack.pop();
//            pushStack.push(pop);
//        }
        pushStack.push(x);
    }

    @Override
    public int pop() {
        if(popStack.isEmpty()){
            while (!pushStack.isEmpty()) {
                Integer push = pushStack.pop();
                popStack.push(push);
            }
        }
        return popStack.pop();
    }

    @Override
    public int peek() {
        if(popStack.isEmpty()) {
            while (!pushStack.isEmpty()) {
                Integer pop = pushStack.pop();
                popStack.push(pop);
            }
        }
        return popStack.peek();
    }

    @Override
    public boolean empty() {
            while (!pushStack.isEmpty()) {
                Integer pop = pushStack.pop();
                popStack.push(pop);
            }
        return popStack.empty();
    }

    public static void main(String[] args) {
        二三二$用栈实现队列 queue = new 二三二$用栈实现队列();
        queue.push(3);
        queue.push(4);
        System.out.println(queue.empty());
//        System.out.println(queue.peek());
//        queue.push(5);
        System.out.println(queue.pop());
//        System.out.println(queue.peek());
        System.out.println(queue.pop());
    }
}
