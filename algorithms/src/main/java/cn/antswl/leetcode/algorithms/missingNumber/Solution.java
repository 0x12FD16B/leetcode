package cn.antswl.leetcode.algorithms.missingNumber;

/**
 * Missing Number
 *
 * problem source: https://leetcode.com/problems/missing-number/solution/
 *
 * @author david-liu
 * @date May 24, 2018
 */
public class Solution {

    // use math concept
    public int missingNumber_1(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return (1 + nums.length) * nums.length / 2 - sum;
    }

    // use big manipulation
    // the core concept is a ^ a = 0, a ^ 0 = a
    // For example
    // Array Index: 0 1 2 3
    // Array Value: 0 1 2 4
    // To use index ^ value, the missing value will get if given a initial number:
    // (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 2) ^ (4 ^ 3) ^ 4  -- the number 4 is the initial number, that is the array's length
    // missing = (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 2) ^ (4 ^ 3) ^ 4
    //         = (0 ^ 0) ^ (1 ^ 1) ^ (2 ^ 2) ^ (4 ^ 4) ^ 3
    //         = 3
    public int missingNumber_2(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= i ^ nums[i];
        }
        return ret ^ nums.length;
    }
}
