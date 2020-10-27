package cn.davidliu.leetcode.algorithms.longestCommonPrefix;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * @author David Liu
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < res.length() && j < strs[i].length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
            if (res.equals("")) return "";
        }

        return res;
    }
}
