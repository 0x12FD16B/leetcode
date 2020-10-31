package cn.davidliu.leetcode.algorithms.binaryTreeLevelOrderTraversalII;


import cn.davidliu.leetcode.algorithms.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 *
 * @author David Liu
 */
public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<List<Integer>> res = new LinkedList<>();
        while (!queue.isEmpty()) {
            Queue<TreeNode> currentLevelQueue = new LinkedList<>();
            List<Integer> currentLevelValues = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                currentLevelValues.add(node.val);
                if (node.left != null) {
                    currentLevelQueue.offer(node.left);
                }
                if (node.right != null) {
                    currentLevelQueue.offer(node.right);
                }
            }
            queue = currentLevelQueue;
            res.add(0, currentLevelValues);
        }

        return res;
    }
}
