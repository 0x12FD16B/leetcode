package cn.davidliu.leetcode.algorithms.longestUncommonSubsequenceI;

/**
 * Longest Uncommon Subsequence I
 *
 * problem source: https://leetcode.com/problems/longest-uncommon-subsequence-i/description/
 *
 * @author david-liu
 * @date May 24, 2018
 */
public class Solution {

    // I think it's a full joke.
    public int findLUSlength(String a, String b) {
        if (!a.equals(b)) {
            return Math.max(a.length(), b.length());
        }
        return -1;
    }

}
