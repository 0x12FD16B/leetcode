package cn.antswl.leetcode.algorithms.toeplitzMatrix;

/**
 * Toeplitz Matrix
 *
 * Problem Source: https://leetcode.com/problems/toeplitz-matrix/description/
 *
 * @author david-liu
 * @date 5/21/18
 */
public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int rc = matrix.length, cc = matrix[0].length;
        int row = rc - 1, col = 0;
        boolean eol = false;
        while (row >= 0 || col < cc - 1) {
            int current = matrix[row][col];
            for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; ) {
                if (current != matrix[i][j]) {
                    return false;
                }
                i--;
                j--;
            }
            if (col == cc - 1) {
                eol = true;
            }
            if (eol) {
                row = row - 1;
            } else {
                col = col + 1;
            }
        }
        return true;
    }
}
