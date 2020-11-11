package cn.davidliu.leetcode.algorithms.validParentheses;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assert.assertTrue(solution.isValid("()"));
        Assert.assertFalse(solution.isValid(")()"));
        Assert.assertFalse(solution.isValid("[()]("));
        Assert.assertFalse(solution.isValid("[(])("));
    }

}