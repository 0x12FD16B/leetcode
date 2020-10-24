package cn.davidliu.leetcode.algorithms.lengthOfLastWord;

/**
 * https://leetcode.com/problems/length-of-last-word/
 *
 * @author David Liu
 */
public class Solution {

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        int length = s.length(), p = length - 1;
        char[] chs = s.toCharArray();
        while (p >= 0 && chs[p] == ' ') p--;
        int f = p;
        while (f >= 0) {
            if (chs[f] == ' ') return p - f;
            f--;
        }
        return p - f;
    }
}
