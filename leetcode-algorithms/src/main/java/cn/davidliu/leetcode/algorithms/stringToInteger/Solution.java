package cn.davidliu.leetcode.algorithms.stringToInteger;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/description/
 *
 * @author david-liu
 */
public class Solution {
    public int myAtoi(String s) {
        if (s == null) return 0;

        char[] chs = s.toCharArray();
        int p = 0, length = chs.length;

        while (p < length && chs[p] == ' ') {
            p++;
        }

        if (p == length) return 0;

        boolean neg = false;
        if (chs[p] == '-' || chs[p] == '+') {
            neg = chs[p] == '-';
            p++;
        }

        int res = 0;

        while (p < chs.length) {
            if (chs[p] < '0' || chs[p] > '9') break;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && Integer.MAX_VALUE % 10 < (chs[p] - '0'))) {
                return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + (chs[p++] - '0');
        }

        return neg ? -res : res;
    }
}
