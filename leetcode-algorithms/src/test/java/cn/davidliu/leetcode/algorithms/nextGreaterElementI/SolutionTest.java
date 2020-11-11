package cn.davidliu.leetcode.algorithms.nextGreaterElementI;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testNextGreaterElementI() {
        Assert.assertArrayEquals(new int[]{-1, 3, -1}, solution.nextGreaterElement_bruceForce(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
        Assert.assertArrayEquals(new int[]{-1, 3, -1}, solution.nextGreaterElement_serialStack(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2}));
    }

}