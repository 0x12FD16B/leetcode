package cn.davidliu.leetcode.algorithms.implementStackUsingQueues;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Implement Stack using Queues
 *
 * problem source:
 *
 * @author david-liu
 * @date May 24, 2018
 */
public class MyStack {

    private Deque<Integer> queue;

    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offerFirst(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Integer top = queue.pollFirst();
        return top == null ? -1 : top;
    }

    /** Get the top element. */
    public int top() {
        return queue.peekFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
