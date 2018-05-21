package cn.antswl.leetcode.algorithms.flippingAnImage;

/**
 * Flipping an Image
 *
 * Problem Source: https://leetcode.com/problems/flipping-an-image/description/
 *
 * @author david-liu
 * @date May 21, 2018
 */
public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int C = A[0].length;
        for (int[] row : A)
            for (int i = 0; i < (C + 1) / 2; i++) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }

        return A;
    }
}
