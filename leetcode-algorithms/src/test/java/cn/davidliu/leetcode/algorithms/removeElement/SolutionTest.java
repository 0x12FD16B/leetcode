package cn.davidliu.leetcode.algorithms.removeElement;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testRemoveElement() {
        // case1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        Solution solution = new Solution();
        Assert.assertEquals(solution.removeElement(nums1, val1), 2);
        // case2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        Assert.assertEquals(solution.removeElement(nums2, val2), 5);
    }
}