package cn.davidliu.leetcode.algorithms.generateParentheses;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void generateParentheses() {
        Solution solution = new Solution();
        final int n = 3;
        List<String> expect = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        Assert.assertTrue(listMatches(solution.generateParentheses(n), expect));
    }

    private boolean listMatches(List<String> one, List<String> another) {
        if (one == null && another == null) return true;
        else {
            if (one == null || another == null) return false;
            if (one.size() != another.size()) return false;
            for (String str : one) {
                if (!another.contains(str)) return false;
            }
        }
        return true;
    }
}