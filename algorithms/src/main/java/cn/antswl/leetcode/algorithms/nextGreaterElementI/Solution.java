package cn.antswl.leetcode.algorithms.nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Next Greater Element I
 *
 * problem source: https://leetcode.com/problems/next-greater-element-i/description/
 *
 * @author david-liu
 * @date 5/21/18
 */
public class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n)
                nextGreaterMap.put(stack.pop(), n);
            stack.push(n);
        }
        for (int i = 0; i < nums1.length; i++) {
            ret[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        return ret;
    }
}
