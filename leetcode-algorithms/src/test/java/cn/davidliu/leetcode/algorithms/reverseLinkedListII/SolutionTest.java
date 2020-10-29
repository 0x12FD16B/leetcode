package cn.davidliu.leetcode.algorithms.reverseLinkedListII;

import cn.davidliu.leetcode.algorithms.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testReverseBetween() {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expect1 = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        Assert.assertEquals(expect1, solution.reverseBetween(head1, 2, 4));
    }
}