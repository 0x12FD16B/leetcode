package cn.davidliu.leetcode.algorithms.reverseLinkedList;

import cn.davidliu.leetcode.algorithms.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/
 *
 * @author David Liu
 */
public class Solution {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode prev = null;
        for (ListNode p = head; p != null; ) {
            ListNode t = p.next;
            p.next = prev;
            prev = p;
            p = t;
        }

        return prev;
    }
}
