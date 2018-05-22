package cn.antswl.leetcode.algorithms.binaryNumberWithAlternatingBits;

/**
 * Binary Number with Alternating Bits
 *
 * problem source: https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 *
 * @author david-liu
 * @date May, 22, 2018
 */
public class Solution {

    public boolean hasAlternatingBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (binaryString.charAt(i) == binaryString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
