package cn.davidliu.leetcode.algorithms.increasingOrderSearchTree;

import cn.davidliu.leetcode.algorithms.TreeNode;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 *
 * @author David Liu
 */
public class Solution {

    private TreeNode res;

    private TreeNode insertPoint;

    // 一边中序遍历, 一边构造结果, 使用了额外的空间
    // 时间复杂度: O(N)
    // 空间复杂度: O(N + H), N 是 二叉树的节点数量, H 是二叉树的高度
    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        return res;
    }

    public TreeNode increasingBST_2(TreeNode root) {
        res = new TreeNode(0);
        insertPoint = res;
        dfs_2(root);
        return res.right;
    }

    private void dfs_2(TreeNode node) {
        if (node == null) {
            return;
        }

        dfs_2(node.left);
        node.left = null;
        insertPoint.right = node;
        insertPoint = insertPoint.right;
        dfs_2(node.right);
    }

    // 中序遍历, 复用二叉树中的节点
    // 时间复杂度: O(N)
    // 空间复杂度: O(H), N 是 二叉树的节点数量, H 是二叉树的高度
    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.left);
        if (res == null) {
            res = new TreeNode(node.val);
            insertPoint = res;
        } else {
            insertPoint.right = new TreeNode(node.val);
            insertPoint = insertPoint.right;
        }
        dfs(node.right);
    }

}
