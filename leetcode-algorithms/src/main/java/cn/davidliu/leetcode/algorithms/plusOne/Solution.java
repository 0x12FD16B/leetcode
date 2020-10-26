package cn.davidliu.leetcode.algorithms.plusOne;

/**
 * https://leetcode.com/problems/plus-one/
 *
 * @author David Liu
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = carry + digits[i];
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 0) return digits;
        int[] res = new int[digits.length + 1];
        System.arraycopy(digits, 0, res, 1, digits.length);
        res[0] = carry;
        return res;
    }
}
