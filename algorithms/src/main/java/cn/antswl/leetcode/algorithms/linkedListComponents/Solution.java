package cn.antswl.leetcode.algorithms.linkedListComponents;

import java.util.HashSet;
import java.util.Set;

/**
 * Linked List Components
 *
 * problem source: https://leetcode.com/problems/linked-list-components/description/
 *
 * @author david-liu
 * @date May 31, 2018
 */
public class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> setG = new HashSet<>();
        for (int i : G) setG.add(i);
        int ret = 0;
        while (head != null) {
            if (setG.contains(head.val) && (head.next == null || !setG.contains(head.next.val))) {
                ret++;
            }
            head = head.next;
        }
        return ret;
    }
}
