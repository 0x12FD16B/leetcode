package cn.davidliu.leetcode.algorithms.trappingRainWater;

import java.util.Stack;

/**
 * https://leetcode.com/problems/trapping-rain-water/
 *
 * @author David Liu
 */
public class Solution {
    // 枚举每一列, 计算每一列可以装多少水
    // 时间复杂度: O(n ^ 2)
    // 空间复杂度: O(1)
    public int trap(int[] height) {
        int res = 0;
        // 第一列和最后一列肯定不会有水
        for (int i = 1; i < height.length - 1; i++) {
            int leftBound = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (height[j] > leftBound) leftBound = height[j];
            }
            int rightBound = 0;
            for (int j = i + 1; j < height.length; j++) {
                if (height[j] > rightBound) rightBound = height[j];
            }
            int min = Math.min(leftBound, rightBound);
            if (min > height[i]) {
                res += (min - height[i]);
            }
        }

        return res;
    }

    // 先计算好每一列的左边界和右边界
    // 时间复杂度: O(N)
    // 空间复杂度: O(N)
    public int trap_dp(int[] height) {
        int res = 0;
        int[] leftBound = new int[height.length];
        int[] rightBound = new int[height.length];

        for (int i = 1; i < height.length - 1; i++) {
            leftBound[i] = Math.max(height[i - 1], leftBound[i - 1]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            rightBound[i] = Math.max(height[i + 1], rightBound[i + 1]);
        }

        for (int i = 1; i < height.length - 1; i++) {
            int min = Math.min(leftBound[i], rightBound[i]);
            if (min > height[i]) {
                res += (min - height[i]);
            }
        }

        return res;
    }

    // 双指针, 在一次遍历的过程中从左右分别扫描边界
    // 时间复杂度: O(N)
    // 空间复杂度: O(1)
    public int trap_leftRightPointer(int[] height) {
        int res = 0, left = 1, right = height.length - 2, maxLeft = 0, maxRight = 0;
        for (int i = 1; i < height.length - 1; i++) {
            if (height[left - 1] < height[right + 1]) {
                maxLeft = Math.max(maxLeft, height[left - 1]);
                int min = maxLeft;
                if (min > height[left]) {
                    res += (min - height[left]);
                }
                left++;
            } else {
                maxRight = Math.max(maxRight, height[right + 1]);
                int min = maxRight;
                if (min > height[right]) {
                    res += (min - height[right]);
                }
                right--;
            }
        }
        return res;
    }

    // 维护单调递减栈
    // 时间复杂度: O(N)
    // 空间复杂度: O(1)
    public int trap_serialStack(int[] height) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < height.length; i++) {
            while (!stack.empty() && height[i] > height[stack.peek()]) {
                int h = height[stack.pop()];
                if (stack.empty()) {
                    break;
                }
                int d = i - stack.peek() - 1;
                int min = Math.min(height[stack.peek()], height[i]);
                res += (d * (min - h));
            }
            stack.push(i);
        }

        return res;
    }
}
