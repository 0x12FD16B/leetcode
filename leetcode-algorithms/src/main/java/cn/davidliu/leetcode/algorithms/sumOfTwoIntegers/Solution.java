package cn.davidliu.leetcode.algorithms.sumOfTwoIntegers;

/**
 * Sum of Two Integers
 *
 * problem source:
 *
 * @author david-liu
 * @date May 22, 2018
 */
public class Solution {
    public int getSum(int a, int b) {
        //Sum of two bits can be obtained by performing XOR (^) operation of two bits.
        //Carry bit can be obtained by performing AND (&) operation of two bits
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
