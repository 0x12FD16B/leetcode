package cn.davidliu.leetcode.algorithms.reverseLinkedList;

import cn.davidliu.leetcode.algorithms.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testReverseList() {
        Assert.assertNull(solution.reverseList(null));
        ListNode node = new ListNode();
        Assert.assertEquals(node, solution.reverseList(node));
        ListNode node1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode expect1 = new ListNode(3, new ListNode(2, new ListNode(1)));
        Assert.assertEquals(expect1, solution.reverseList(node1));
    }
}