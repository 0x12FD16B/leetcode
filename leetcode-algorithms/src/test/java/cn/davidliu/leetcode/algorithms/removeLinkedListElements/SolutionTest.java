package cn.davidliu.leetcode.algorithms.removeLinkedListElements;

import cn.davidliu.leetcode.algorithms.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void removeElements() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null)))))));
        int val = 6;
        ListNode expect = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Assert.assertEquals(expect, new Solution().removeElements(head, val));
    }
}