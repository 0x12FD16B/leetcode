package cn.davidliu.leetcode.algorithms.shiftingLetters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    /**
     * case1:
     * input: s = "abc", shifts = [3, 5, 9]
     * expect: "rpl"
     */
    @Test
    public void testShiftingLettersCase1() {
        String expect = "rpl";
        String s = "abc";
        int[] shifts = new int[]{3, 5, 9};
        Assert.assertEquals(expect, solution.shiftingLetters_method1(s, shifts));
        Assert.assertEquals(expect, solution.shiftingLetters_method2(s, shifts));
        Assert.assertEquals(expect, solution.shiftingLetters_method3(s, shifts));
    }

    /**
     * case2:
     * input: s = "z", shifts = [52]
     * expect: "z"
     */
    @Test
    public void testShiftingLettersCase2() {
        String expect = "z";
        String s = "z";
        int[] shifts = new int[]{52};
        Assert.assertEquals(expect, solution.shiftingLetters_method1(s, shifts));
        Assert.assertEquals(expect, solution.shiftingLetters_method2(s, shifts));
        Assert.assertEquals(expect, solution.shiftingLetters_method3(s, shifts));
    }

    /**
     * case3:
     * input:
     * 1. s = null, shifts = []
     * 2. s = "", shifts = null
     * expect: s
     */
    @Test
    public void testShiftingLettersCase3() {
        // 1
        Assert.assertNull(solution.shiftingLetters_method1(null, new int[0]));
        Assert.assertNull(solution.shiftingLetters_method2(null, new int[0]));
        Assert.assertNull(solution.shiftingLetters_method3(null, new int[0]));
        // 2
        Assert.assertEquals("", solution.shiftingLetters_method1("", null));
        Assert.assertEquals("", solution.shiftingLetters_method2("", null));
        Assert.assertEquals("", solution.shiftingLetters_method3("", null));
    }
}