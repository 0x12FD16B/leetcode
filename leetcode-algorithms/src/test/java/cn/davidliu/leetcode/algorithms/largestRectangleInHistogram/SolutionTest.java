package cn.davidliu.leetcode.algorithms.largestRectangleInHistogram;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testLargestRectangleArea_bruceForce() {
        Assert.assertEquals(0, solution.largestRectangleArea_bruceForce(new int[0]));
        Assert.assertEquals(10, solution.largestRectangleArea_bruceForce(new int[]{2, 1, 5, 6, 2, 3}));

        Assert.assertEquals(0, solution.largestRectangleArea_serialStack(new int[0]));
        Assert.assertEquals(10, solution.largestRectangleArea_serialStack(new int[]{2, 1, 5, 6, 2, 3}));
    }
}