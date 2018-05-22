package cn.antswl.leetcode.algorithms.numberOf1Bits;

/**
 * Number of 1 Bits
 *
 * problem source: https://leetcode.com/problems/number-of-1-bits/discuss/55099/Simple-Java-Solution-Bit-Shifting
 *
 * @author david-liu
 * @date 5/22/18
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
