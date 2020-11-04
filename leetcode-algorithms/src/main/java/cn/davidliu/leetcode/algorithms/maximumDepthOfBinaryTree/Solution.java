package cn.davidliu.leetcode.algorithms.maximumDepthOfBinaryTree;

import cn.davidliu.leetcode.algorithms.TreeNode;

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 *
 * @author David Liu
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
