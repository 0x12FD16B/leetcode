package cn.antswl.leetcode.algorithms.maximumSwap;

/**
 * Maximum Swap
 *
 * problem source: https://leetcode.com/problems/maximum-swap/description/
 *
 * @author david-liu
 * @date May 31, 2018
 */
public class Solution {

    // use buckets contains 0-9 to replace first smaller number than current when iterating from left to right
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();

        int[] buckets = new int[10];
        for (int i = 0; i < digits.length; i++) {
            buckets[digits[i] - '0'] = i;
        }

        for (int i = 0; i < digits.length; i++) {
            for (int k = 9; k > digits[i] - '0'; k--) {
                if (buckets[k] > i) {
                    char tmp = digits[i];
                    digits[i] = digits[buckets[k]];
                    digits[buckets[k]] = tmp;
                    return Integer.valueOf(new String(digits));
                }
            }
        }

        return num;
    }
}
