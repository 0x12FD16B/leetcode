package cn.davidliu.leetcode.algorithms.plusOne;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void plusOne() {
        Assert.assertArrayEquals(new int[]{1}, solution.plusOne(new int[0]));
        Assert.assertArrayEquals(new int[]{1, 0}, solution.plusOne(new int[]{9}));
        Assert.assertArrayEquals(new int[]{9}, solution.plusOne(new int[]{8}));
    }
}