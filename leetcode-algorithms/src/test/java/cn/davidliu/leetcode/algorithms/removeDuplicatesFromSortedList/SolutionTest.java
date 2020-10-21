package cn.davidliu.leetcode.algorithms.removeDuplicatesFromSortedList;

import cn.davidliu.leetcode.algorithms.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testDeleteDuplicatesWhenGivingNullListOrSingleElementListItSelfShouldReturn() {
        Assert.assertNull(solution.deleteDuplicates(null));
        ListNode head = new ListNode(1);
        Assert.assertEquals(head, solution.deleteDuplicates(head));
    }

    @Test
    public void testDeleteDuplicatesWhenGivingNormalInputAndCorrectResultShouldBeReturn() {
        ListNode case1 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3))));
        ListNode expect1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        Assert.assertEquals(expect1, solution.deleteDuplicates(case1));
        ListNode case2 = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        ListNode expect2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        Assert.assertEquals(expect2, solution.deleteDuplicates(case2));
    }
}