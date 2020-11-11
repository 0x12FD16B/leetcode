package cn.davidliu.leetcode.algorithms.nextGreaterElementI;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/next-greater-element-i/description/
 *
 * @author David Liu
 */
public class Solution {

    public int[] nextGreaterElement_serialStack(int[] nums1, int[] nums2) {
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

    public int[] nextGreaterElement_bruceForce(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0, r = -1;
            while (j < nums2.length && nums2[j] != nums1[i]) j++;
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > nums2[j]) {
                    r = nums2[k];
                    break;
                }
            }
            res[i] = r;
        }
        return res;
    }
}
