package cn.davidliu.leetcode.algorithms.containsDuplicate;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        Assert.assertTrue(solution.containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(solution.containsDuplicate(new int[]{1, 2, 3, 4}));
    }

}