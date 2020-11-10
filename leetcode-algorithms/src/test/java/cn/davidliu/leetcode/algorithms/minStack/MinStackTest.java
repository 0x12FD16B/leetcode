package cn.davidliu.leetcode.algorithms.minStack;

import org.junit.Assert;
import org.junit.Test;

public class MinStackTest {

    @Test
    public void testMinStackUsingStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        Assert.assertEquals(-2, minStack.getMin());
        minStack.push(0);
        Assert.assertEquals(-2, minStack.getMin());
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        Assert.assertEquals(-3, minStack.top());
        minStack.pop();
        Assert.assertEquals(-2, minStack.getMin());
    }

    @Test
    public void testMinStackUsingLinkedList() {
        MinStackUsingLinkedList minStack = new MinStackUsingLinkedList();
        minStack.push(-2);
        Assert.assertEquals(-2, minStack.getMin());
        minStack.push(0);
        Assert.assertEquals(-2, minStack.getMin());
        minStack.push(-3);
        Assert.assertEquals(-3, minStack.getMin());
        Assert.assertEquals(-3, minStack.top());
        minStack.pop();
        Assert.assertEquals(-2, minStack.getMin());
    }

}