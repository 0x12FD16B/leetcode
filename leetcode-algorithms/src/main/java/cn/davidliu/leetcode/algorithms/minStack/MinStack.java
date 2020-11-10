package cn.davidliu.leetcode.algorithms.minStack;

import java.util.Stack;

/**
 * https://leetcode.com/problems/min-stack/
 *
 * @author David Liu
 */
public class MinStack {
    private final Stack<Integer> stack = new Stack<>();

    private final Stack<Integer> minElementStack = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public MinStack() {

    }

    public void push(int x) {
        int pushMinElement = stack.isEmpty() ? x : Math.min(minElementStack.peek(), x);
        stack.push(x);
        minElementStack.push(pushMinElement);
    }

    public void pop() {
        stack.pop();
        minElementStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minElementStack.peek();
    }
}
