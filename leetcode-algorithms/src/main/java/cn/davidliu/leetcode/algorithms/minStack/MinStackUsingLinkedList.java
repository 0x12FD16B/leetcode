package cn.davidliu.leetcode.algorithms.minStack;

/**
 * https://leetcode.com/problems/min-stack/
 *
 * @author David Liu
 */
public class MinStackUsingLinkedList {

    private final ListNode head;

    /**
     * initialize your data structure here.
     */
    public MinStackUsingLinkedList() {
        this.head = new ListNode(0, 0, null);
    }

    public void push(int x) {
        ListNode t = this.head.next;
        int currentMin = t == null ? x : Math.min(t.min, x);
        this.head.next = new ListNode(x, currentMin, t);
    }

    public void pop() {
        this.head.next = this.head.next.next;
    }

    public int top() {
        return this.head.next.val;
    }

    public int getMin() {
        return this.head.next.min;
    }

    private static class ListNode {
        public int val;

        public int min;

        public ListNode next;

        public ListNode(int val, int min, ListNode next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
