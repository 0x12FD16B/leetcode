package cn.davidliu.leetcode.algorithms.permutations;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testPermute() {
        Assert.assertEquals(Collections.emptyList(), solution.permute(null));
        Assert.assertEquals(Collections.emptyList(), solution.permute(new int[0]));
        List<List<Integer>> expect = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1)
        );
        this.assertResultEquals(expect, solution.permute(new int[]{1, 2, 3}));
    }

    private void assertResultEquals(List<List<Integer>> expect, List<List<Integer>> actual) {
        Assert.assertEquals(expect.size(), actual.size());
        for (List<Integer> el : expect) {
            Assert.assertTrue(actual.contains(el));
        }
    }
}