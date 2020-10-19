package cn.davidliu.leetcode.algorithms.countAndSay;

/**
 * https://leetcode.com/problems/count-and-say/
 *
 * @author David Liu
 */
public class Solution {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }

        String s = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int length = s.length();
        char[] chs = s.toCharArray();
        char prev = chs[0];
        int count = 1;
        for (int i = 1; i < length; i++) {
            if (prev == chs[i]) {
                count++;
            } else {
                result.append(count).append(prev);
                count = 1;
                prev = chs[i];
            }
        }
        result.append(count).append(prev);
        return result.toString();
    }
}
