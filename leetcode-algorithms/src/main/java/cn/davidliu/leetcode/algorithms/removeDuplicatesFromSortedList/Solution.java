package cn.davidliu.leetcode.algorithms.removeDuplicatesFromSortedList;

import cn.davidliu.leetcode.algorithms.ListNode;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 *
 * @author David Liu
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode prev = head, current = head.next;

        do {
            if (prev.val == current.val) {
                prev.next = current.next;
            } else {
                prev = current;
            }
            current = current.next;

        } while (current != null);

        return head;
    }
}
