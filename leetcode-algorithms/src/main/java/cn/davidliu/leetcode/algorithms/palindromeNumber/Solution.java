package cn.davidliu.leetcode.algorithms.palindromeNumber;

/**
 * https://leetcode.com/problems/palindrome-number/
 *
 * @author david-liu
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) return false;
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

    public boolean isPalindrome_2(int x) {
        if (x < 0 || (x > 0 && x % 10 == 0)) return false;
        int res = 0, t = x;
        while (t > 0) {
            res = res * 10 + t % 10;
            t = t / 10;
        }
        return x == res;
    }
}
