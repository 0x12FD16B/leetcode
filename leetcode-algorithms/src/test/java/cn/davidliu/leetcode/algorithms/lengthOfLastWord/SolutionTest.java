package cn.davidliu.leetcode.algorithms.lengthOfLastWord;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testLengthOfLastWord() {
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World"));
        Assert.assertEquals(5, solution.lengthOfLastWord("Hello World     "));
        Assert.assertEquals(1, solution.lengthOfLastWord("H     "));
        Assert.assertEquals(0, solution.lengthOfLastWord("     "));
        Assert.assertEquals(0, solution.lengthOfLastWord(""));
        Assert.assertEquals(0, solution.lengthOfLastWord(null));
    }
}