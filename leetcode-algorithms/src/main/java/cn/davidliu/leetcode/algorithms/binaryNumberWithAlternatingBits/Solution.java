package cn.davidliu.leetcode.algorithms.binaryNumberWithAlternatingBits;

/**
 * https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 *
 * @author david-liu
 */
public class Solution {

    // use java api to convert n to binary string
    public boolean hasAlternatingBits_method1(int n) {
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (binaryString.charAt(i) == binaryString.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    // use bit operation
    public boolean hasAlternatingBits_method2(int n) {
        int prevLastBit = -1;
        for (int lastBit = (n & 1); n > 0; n >>= 1, lastBit = (n & 1)) {
            if (prevLastBit != -1 && prevLastBit == lastBit) return false;
            prevLastBit = lastBit;
        }
        return true;
    }
}
