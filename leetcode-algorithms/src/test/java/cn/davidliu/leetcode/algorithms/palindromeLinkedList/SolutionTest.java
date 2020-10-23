package cn.davidliu.leetcode.algorithms.palindromeLinkedList;

import cn.davidliu.leetcode.algorithms.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testIsPalindromeList_using_reverse_list() {
        ListNode case1 = new ListNode(1, new ListNode(2));
        Assert.assertFalse(solution.isPalindrome_using_reverse_list(case1));
        Assert.assertTrue(solution.isPalindrome_using_reverse_list(null));
        Assert.assertTrue(solution.isPalindrome_using_reverse_list(new ListNode(1)));

        ListNode case2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Assert.assertTrue(solution.isPalindrome_using_reverse_list(case2));
    }

    @Test
    public void testIsPalindromeList_with_stack() {
        ListNode case1 = new ListNode(1, new ListNode(2));
        Assert.assertFalse(solution.isPalindrome_with_stack(case1));
        Assert.assertTrue(solution.isPalindrome_with_stack(null));
        Assert.assertTrue(solution.isPalindrome_with_stack(new ListNode(1)));

        ListNode case2 = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        Assert.assertTrue(solution.isPalindrome_with_stack(case2));
    }

    @Test
    public void testIsPalindrome_with_half_reserve() {
        ListNode case1 = new ListNode(1, new ListNode(2));
        Assert.assertFalse(solution.isPalindrome_with_half_reserve(case1));
        Assert.assertTrue(solution.isPalindrome_with_half_reserve(null));
        Assert.assertTrue(solution.isPalindrome_with_half_reserve(new ListNode(1)));

        Assert.assertTrue(solution.isPalindrome_with_half_reserve(new ListNode(1, new ListNode(2, new ListNode(1)))));
        Assert.assertTrue(solution.isPalindrome_with_half_reserve(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))));

        Assert.assertFalse(solution.isPalindrome_with_half_reserve(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(1))))));

        Assert.assertTrue(solution.isPalindrome_with_half_reserve(new ListNode(1, new ListNode(1))));
    }

}