package cn.antswl.leetcode.algorithms.reverseBits;

/**
 * Reverse Bits
 *
 * problem source: https://leetcode.com/problems/reverse-bits/description/
 *
 * @author david-liu
 * @date May 22, 2018
 */
public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            ret = (ret << 1) + (n & 1);
            n = n >> 1;
        }
        return ret;
    }
}
