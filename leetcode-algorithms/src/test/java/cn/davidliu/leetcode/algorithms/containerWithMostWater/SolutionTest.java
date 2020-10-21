package cn.davidliu.leetcode.algorithms.containerWithMostWater;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testMaxArea() {
        Solution solution = new Solution();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expect = 49;
        Assert.assertEquals(expect, solution.maxArea_method1(heights));
        Assert.assertEquals(expect, solution.maxArea_method2(heights));
    }
}