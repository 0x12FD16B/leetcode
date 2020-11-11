package cn.davidliu.leetcode.algorithms.largestRectangleInHistogram;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/largest-rectangle-in-histogram/
 *
 * @author David Liu
 */
public class Solution {
    // 枚举每个柱子, 分别向左向右找到矩形的左右边界
    // 时间复杂度: O(n ^ 2)
    // 空间复杂度: O(1)
    public int largestRectangleArea_bruceForce(int[] heights) {
        int area = 0;
        for (int i = 0; i < heights.length; i++) {
            int w = 1, h = heights[i], j = i;
            while (++j < heights.length && heights[j] >= h) w++;
            j = i;
            while (--j >= 0 && heights[j] >= h) w++;
            area = Math.max(area, w * h);
        }

        return area;
    }

    // 使用单调递增栈, 将获取柱子的边界的时间复杂度由 O(N) 降到 O(1)
    // 时间复杂度: O(N)
    // 空间复杂度: O(1)
    public int largestRectangleArea_serialStack(int[] heights) {
        int[] tmp = new int[heights.length + 2];
        System.arraycopy(heights, 0, tmp, 1, heights.length);
        Deque<Integer> stack = new ArrayDeque<>();
        int area = 0;
        for (int i = 0; i < tmp.length; i++) {
            while (!stack.isEmpty() && tmp[i] < tmp[stack.peek()]) {
                int h = tmp[stack.pop()];
                area = Math.max(area, h * (i - stack.peek() - 1));
            }
            stack.push(i);
        }
        return area;
    }
}
