package cn.davidliu.leetcode.algorithms.zigZagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * ZigZag Conversion
 *
 * problem source: https://leetcode.com/problems/zigzag-conversion/description/
 *
 * @author david-liu
 * @date May 25, 2018
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (s.isEmpty() || s.length() == 1 || numRows == 1) {
            return s;
        }
        List<List<Character>> lines = new ArrayList<List<Character>>() {
            {
                for (int i = 0; i < numRows; i++) {
                    add(new ArrayList<>());
                }
            }
        };
        char[] chars = s.toCharArray();
        boolean asc = true;
        int x = 0, y = 0;
        for (char ch : chars) {
            List<Character> line = lines.get(y);
            if (x > 0) {
                for (int i = line.size(); i < x; i++) {
                    line.add(' ');
                }
            }
            line.add(ch);
            if (asc) {
                y = y + 1;
            } else {
                x = x + 1;
                y = y - 1;
            }
            if (y == numRows - 1 || y == 0) {
                asc = !asc;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> line : lines) {
            for (Character ch : line) {
                if (ch != ' ') {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
