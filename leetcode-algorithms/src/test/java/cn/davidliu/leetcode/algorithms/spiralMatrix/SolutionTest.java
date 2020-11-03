package cn.davidliu.leetcode.algorithms.spiralMatrix;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void spiralOrder() {
        Assert.assertEquals(Collections.emptyList(), solution.spiralOrder(null));
        Assert.assertEquals(Collections.emptyList(), solution.spiralOrder(new int[0][0]));
        Assert.assertEquals(Collections.emptyList(), solution.spiralOrder(new int[3][0]));
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expect = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        Assert.assertEquals(expect, solution.spiralOrder(matrix));

        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        List<Integer> expect1 = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        Assert.assertEquals(expect1, solution.spiralOrder(matrix1));
        Assert.assertEquals(Arrays.asList(1, 2, 3), solution.spiralOrder(new int[][]{
                {1},
                {2},
                {3}
        }));
        Assert.assertEquals(Arrays.asList(1, 1, 3, 3), solution.spiralOrder(new int[][]{
                {1, 1},
                {3, 3}
        }));
        Assert.assertEquals(Arrays.asList(1, 1, 3, 3, 3, 3), solution.spiralOrder(new int[][]{
                {1, 1},
                {3, 3},
                {3, 3},
        }));
    }
}