package cn.davidliu.leetcode.algorithms.zigZagConversion;

/**
 * ZigZag Conversion
 * <p>
 * problem source: https://leetcode.com/problems/zigzag-conversion/description/
 *
 * @author david-liu
 * @date May 25, 2018
 */
public class Solution {
    // 遍历 s 中每个字符, 输出字符到指定的行, 使用布尔变量控制纵向输出的方向
    // 时间复杂度: O(N), N = s.length()
    // 空间复杂度: O(N)
    public String convert_method1(String s, int numRows) {
        if (numRows == 1) return s;

        boolean downForward = true;
        char[] chs = s.toCharArray();
        StringBuilder[] container = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            container[i] = new StringBuilder();
        }

        int containerIdx = 0;
        for (int i = 0; i < s.length(); i++) {
            container[containerIdx].append(chs[i]);
            if (containerIdx == numRows - 1) {
                downForward = false;
            }
            if (containerIdx == 0) {
                downForward = true;
            }
            containerIdx += downForward ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : container) {
            result.append(builder.toString());
        }

        return result.toString();
    }

    // 遍历 s 中每个字符, 输出字符到指定的行, 使用布尔变量控制纵向输出的方向
    // 时间复杂度: O(N), N = s.length()
    // 空间复杂度: O(N)
    public String convert_method2(String s, int numRows) {
        if (numRows == 1) return s;

        char[] chars = s.toCharArray();
        StringBuilder[] builders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            builders[i] = new StringBuilder();
        }


        for (int i = 0; i < chars.length; ) {
            for (int idx = 0; idx < numRows && i < chars.length; idx++) {
                builders[idx].append(chars[i++]);
            }

            for (int idx = numRows - 2; idx > 0 && i < chars.length; idx--) {
                builders[idx].append(chars[i++]);
            }
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder builder : builders) {
            result.append(builder.toString());
        }

        return result.toString();
    }
}
