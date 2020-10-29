package cn.davidliu.leetcode.algorithms.reverseLinkedListII;

import cn.davidliu.leetcode.algorithms.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list-ii/
 *
 * @author David Liu
 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        int count = 1;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode p = dummyHead;
        while (count != m) {
            p = p.next;
            count++;
        }

        p.next = reverse(p.next, n - m + 1);
        return dummyHead.next;
    }

    private ListNode reverse(ListNode head, int num) {
        ListNode prev = null, p = head;
        for (int i = 0; i < num; i++) {
            ListNode next = p.next;
            p.next = prev;
            prev = p;
            p = next;
        }
        head.next = p;
        return prev;
    }
}
