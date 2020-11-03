package cn.davidliu.leetcode.algorithms.maximumBinaryTreeII;

import cn.davidliu.leetcode.algorithms.TreeNode;

/**
 * https://leetcode.com/problems/maximum-binary-tree-ii/
 *
 * @author David Liu
 */
public class Solution {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (root.val < val) {
            TreeNode node = new TreeNode(val);
            node.left = root;
            return node;
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }
}
