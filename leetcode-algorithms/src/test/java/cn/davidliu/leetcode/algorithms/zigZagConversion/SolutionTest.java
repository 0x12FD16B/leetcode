package cn.davidliu.leetcode.algorithms.zigZagConversion;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test for cn.davidliu.leetcode.algorithms.zigZagConversion.Solution
 */
public class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * Input: s = "PAYPALISHIRING", numRows = 3
     * Output: "PAHNAPLSIIGYIR"
     */
    @Test
    public void testConvertCase1() {
        String input = "PAYPALISHIRING";
        String expect = "PAHNAPLSIIGYIR";
        int numRows = 3;
        Assert.assertEquals(expect, solution.convert_method1(input, numRows));
        Assert.assertEquals(expect, solution.convert_method2(input, numRows));
    }

    /**
     * Input: s = "PAYPALISHIRING", numRows = 1
     * Output: "PAYPALISHIRING"
     */
    @Test
    public void testConvertCase2() {
        String input = "PAYPALISHIRING";
        String expect = "PAYPALISHIRING";
        int numRows = 1;
        Assert.assertEquals(expect, solution.convert_method1(input, numRows));
        Assert.assertEquals(expect, solution.convert_method2(input, numRows));
    }

}