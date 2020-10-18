package cn.davidliu.leetcode.algorithms.removeLinkedListElements;

import cn.davidliu.leetcode.algorithms.ListNode;

/**
 * https://leetcode.com/problems/remove-linked-list-elements/
 *
 * @author David Liu
 */
public class Solution {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(0, head);
        ListNode prev = dummyHead, current = head;

        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;
        }

        return dummyHead.next;
    }
}
