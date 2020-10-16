package cn.davidliu.leetcode.algorithms.singleNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Single Number
 *
 * problem source: https://leetcode.com/problems/single-number/solution/
 *
 * @author david-liu
 * @date May 24, 2018
 */
public class Solution {

    // Use hash table
    public int singleNumber_1(int[] nums) {
        Map<Integer, Integer> numCountMap = new HashMap<>();
        for (int n : nums) {
            int c = numCountMap.getOrDefault(n, 0);
            numCountMap.put(n, c + 1);
        }

        int r = 0;
        for (Map.Entry<Integer, Integer> entry : numCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                r = entry.getKey();
            }
        }
        return r;
    }

    // Use bit manipulation
    // Concept:
    // If we take XOR of zero and some bit, it will return that bit
    //      a ^ 0 = a
    // If we take XOR of two same bits, it will return 0
    //      a ^ a = 0
    // a ^ b ^ a = a ^ a ^ b = 0 ^ b = b
    public int singleNumber_2(int[] nums) {
        int ret = 0;
        for (int n : nums) {
            ret = ret ^ n;
        }
        return ret;
    }
}
