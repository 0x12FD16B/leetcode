package cn.davidliu.leetcode.algorithms.threeSum;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testThreeSum() {
        List<List<Integer>> expect1 = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        Assert.assertEquals(expect1, solution.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        Assert.assertEquals(Collections.emptyList(), solution.threeSum(new int[]{-1, 0}));
        Assert.assertEquals(Collections.emptyList(), solution.threeSum(null));
        List<List<Integer>> expect2 = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
        Assert.assertEquals(expect2, solution.threeSum(new int[]{-1, -1, 0, 0, 1, 1, 2, -1, -4}));
    }
}