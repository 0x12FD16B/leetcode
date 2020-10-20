package cn.davidliu.leetcode.algorithms.generateParentheses;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/
 *
 * @author David Liu
 */
public class Solution {

    public List<String> generateParentheses(int n) {
        List<String> result = new ArrayList<>();
        dfs("", 0, 0, n, result);
        return result;
    }

    private void dfs(String current, int left, int right, int n, List<String> result) {
        if (left + right == 2 * n) {
            result.add(current);
            return;
        }

        if (left < n) {
            dfs(current + "(", left + 1, right, n, result);
        }

        if (right < left) {
            dfs(current + ")", left, right + 1, n, result);
        }
    }
}
