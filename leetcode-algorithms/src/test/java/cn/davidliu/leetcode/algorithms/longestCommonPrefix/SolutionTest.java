package cn.davidliu.leetcode.algorithms.longestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testLongestCommonPrefix() {
        Assert.assertEquals("fl", solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", solution.longestCommonPrefix(null));
        Assert.assertEquals("", solution.longestCommonPrefix(new String[0]));
        Assert.assertEquals("", solution.longestCommonPrefix(new String[]{"hel", "loo"}));
        Assert.assertEquals("hel", solution.longestCommonPrefix(new String[]{"hel", "hello"}));
    }
}