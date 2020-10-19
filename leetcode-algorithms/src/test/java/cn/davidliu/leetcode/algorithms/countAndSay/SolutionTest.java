package cn.davidliu.leetcode.algorithms.countAndSay;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void countAndSay() {
        Assert.assertEquals(solution.countAndSay(1), "1");
        Assert.assertEquals(solution.countAndSay(2), "11");
        Assert.assertEquals(solution.countAndSay(3), "21");
        Assert.assertEquals(solution.countAndSay(4), "1211");
        Assert.assertEquals(solution.countAndSay(5), "111221");
        Assert.assertEquals(solution.countAndSay(6), "312211");
    }
}