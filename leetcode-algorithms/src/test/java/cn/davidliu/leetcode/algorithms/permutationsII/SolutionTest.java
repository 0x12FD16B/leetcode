package cn.davidliu.leetcode.algorithms.permutationsII;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testPermuteUnique() {
        List<List<Integer>> expect = Arrays.asList(
                Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), Arrays.asList(2, 1, 1)
        );
        List<List<Integer>> actual = solution.permuteUnique(new int[]{1, 1, 2});
        assertResultEquals(expect, actual);
        Assert.assertEquals(Collections.emptyList(), solution.permuteUnique(null));
        Assert.assertEquals(Collections.emptyList(), solution.permuteUnique(new int[0]));

    }

    private void assertResultEquals(List<List<Integer>> expect, List<List<Integer>> actual) {
        Assert.assertEquals(expect.size(), actual.size());
        for (List<Integer> el : expect) {
            Assert.assertTrue(actual.contains(el));
        }
    }
}