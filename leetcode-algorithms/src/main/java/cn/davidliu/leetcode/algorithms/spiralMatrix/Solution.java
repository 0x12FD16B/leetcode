package cn.davidliu.leetcode.algorithms.spiralMatrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/spiral-matrix/
 *
 * @author David Liu
 */
public class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return Collections.emptyList();
        int height = matrix.length, width = matrix[0].length;
        int topBound = 0, rightBound = width - 1, bottomBound = height - 1, leftBound = 0;
        List<Integer> res = new ArrayList<>();
        Direction direction = Direction.RIGHT;
        while (res.size() < height * width) {
            switch (direction) {
                case RIGHT:
                    for (int i = leftBound; i <= rightBound & res.size() < height * width; i++) {
                        res.add(matrix[topBound][i]);
                    }
                    direction = Direction.BOTTOM;
                    topBound++;
                    break;
                case BOTTOM:
                    for (int i = topBound; i <= bottomBound & res.size() < height * width; i++) {
                        res.add(matrix[i][rightBound]);
                    }
                    rightBound--;
                    direction = Direction.LEFT;
                    break;
                case LEFT:
                    for (int i = rightBound; i >= leftBound & res.size() < height * width; i--) {
                        res.add(matrix[bottomBound][i]);
                    }
                    bottomBound--;
                    direction = Direction.TOP;
                    break;
                case TOP:
                    for (int i = bottomBound; i >= topBound & res.size() < height * width; i--) {
                        res.add(matrix[i][leftBound]);
                    }
                    leftBound++;
                    direction = Direction.RIGHT;
                    break;
            }
        }
        return res;
    }

    private enum Direction {
        TOP,
        BOTTOM,
        LEFT,
        RIGHT;
    }
}
