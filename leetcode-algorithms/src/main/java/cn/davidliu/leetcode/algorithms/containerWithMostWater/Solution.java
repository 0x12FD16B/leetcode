package cn.davidliu.leetcode.algorithms.containerWithMostWater;

/**
 * https://leetcode.com/problems/container-with-most-water/
 *
 * @author David Liu
 */
public class Solution {
    // solution1: bruce force
    // enumerate all areas and get the max
    // time complexity: O(n ^ 2), n = heights.length
    // space complexity: O(1)
    public int maxArea_method1(int[] heights) {
        int length = heights.length;
        int maxArea = 0;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                maxArea = Math.max(maxArea, (j - i) * Math.min(heights[i], heights[j]));
            }
        }

        return maxArea;
    }

    // solution2: two pointers
    // one array iterate to calculate the maxArea
    // time complexity: O(n), n = heights.length
    // space complexity: O(1)
    public int maxArea_method2(int[] heights) {
        int maxArea = 0;
        for (int left = 0, right = heights.length - 1; left < right; ) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(heights[left], heights[right]));
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
