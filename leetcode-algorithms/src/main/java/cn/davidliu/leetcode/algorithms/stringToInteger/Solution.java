package cn.davidliu.leetcode.algorithms.stringToInteger;

/**
 * String to Integer (atoi)
 *
 * problem source: https://leetcode.com/problems/string-to-integer-atoi/description/
 *
 * @author david-liu
 * @date May 28, 2018
 */
public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.trim().length() == 0) {
            return 0;
        }
        str = str.trim();
        char firstChar = str.charAt(0);
        int num = 0, index = 0, sign = 1;
        if (firstChar == '+' || firstChar == '-') {
            index = 1;
            if (firstChar == '-') {
                sign = -1;
            }
        }
        while (index < str.length()) {
            char ch = str.charAt(index);
            if (ch < '0' || ch > '9') break;
            if (Integer.MAX_VALUE / 10 < num || Integer.MAX_VALUE / 10 == num && Integer.MAX_VALUE % 10 < (ch - '0')) {
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            num = num * 10 + (ch - '0');
            index++;
        }
        return sign * num;
    }
}
