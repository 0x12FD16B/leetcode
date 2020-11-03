package cn.davidliu.leetcode.algorithms.palindromeNumber;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testIsPalindrome() {
        Assert.assertFalse(solution.isPalindrome(-1));
        Assert.assertFalse(solution.isPalindrome(10));
        Assert.assertTrue(solution.isPalindrome(0));
        Assert.assertTrue(solution.isPalindrome(121));
        Assert.assertFalse(solution.isPalindrome(123));
        Assert.assertFalse(solution.isPalindrome_2(-1));
        Assert.assertFalse(solution.isPalindrome_2(10));
        Assert.assertTrue(solution.isPalindrome_2(0));
        Assert.assertTrue(solution.isPalindrome_2(121));
        Assert.assertFalse(solution.isPalindrome_2(123));
    }
}