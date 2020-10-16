package cn.davidliu.leetcode.algorithms.numberOf1Bits;

/**
 * Number of 1 Bits
 *
 * problem source: https://leetcode.com/problems/number-of-1-bits/discuss/55099/Simple-Java-Solution-Bit-Shifting
 *
 * @author david-liu
 * @date May 22, 2018
 */
public class Solution {
    // you need to treat n as an unsigned value
    // Use java.lang.Integer.bitCount
    public int hammingWeight_1(int n) {
        return Integer.bitCount(n);
    }

    // you need to treat n as an unsigned value
    // Use bit shift
    public int hammingWeight_2(int n) {
        int ret = 0;
        while (n != 0) {
            ret = ret + (n & 1);
            n = n >>> 1;
        }
        return ret;
    }
}
