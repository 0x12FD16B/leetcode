package cn.davidliu.leetcode.algorithms.binaryNumberWithAlternatingBits;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testBinaryNumberWithAlternatingBits() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.hasAlternatingBits_method1(5));
        Assert.assertTrue(solution.hasAlternatingBits_method2(5));
        Assert.assertFalse(solution.hasAlternatingBits_method1(7));
        Assert.assertFalse(solution.hasAlternatingBits_method2(7));
        Assert.assertFalse(solution.hasAlternatingBits_method1(11));
        Assert.assertFalse(solution.hasAlternatingBits_method2(11));
        Assert.assertTrue(solution.hasAlternatingBits_method1(10));
        Assert.assertTrue(solution.hasAlternatingBits_method2(10));
        Assert.assertFalse(solution.hasAlternatingBits_method1(3));
        Assert.assertFalse(solution.hasAlternatingBits_method2(3));
    }
}