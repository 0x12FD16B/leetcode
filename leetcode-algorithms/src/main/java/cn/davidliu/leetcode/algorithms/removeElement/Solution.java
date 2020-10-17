package cn.davidliu.leetcode.algorithms.removeElement;

/**
 * https://leetcode.com/problems/remove-element/
 *
 * @author David Liu
 */
public class Solution {

    public int removeElement(int[] nums, int val) {
        int p = 0;
        for (int num : nums) {
            if (num != val) {
                nums[p++] = num;
            }
        }

        return p;
    }
}
