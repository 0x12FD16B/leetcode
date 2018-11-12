package cn.antswl.leetcode.algorithms.palindromeNumber;

/**
 * Palindrome Number
 * <p>
 * problem source: https://leetcode.com/submissions/detail/189043838/
 *
 * @author david-liu
 * @date Nov 12, 2018
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x > 0 && x % 10 == 0) return false;
        int[] n = new int[64];
        int count = 0;
        int t = x;
        do {
            n[count++] = t % 10;
            t = t / 10;
        } while (t != 0);
        int r = 0;
        for (int i = count - 1; i >= 0; i--) {
            r += n[i] * (int) Math.pow(10, count - 1 - i);
        }
        return x == r;
    }
}
