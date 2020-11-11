package cn.davidliu.leetcode.algorithms.dailyTemperatures;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testDailyTemperatures() {
        Assert.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, solution.dailyTemperatures_bruceForce(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
        Assert.assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, solution.dailyTemperatures_serialStack(new int[]{73, 74, 75, 71, 69, 72, 76, 73}));
    }

}