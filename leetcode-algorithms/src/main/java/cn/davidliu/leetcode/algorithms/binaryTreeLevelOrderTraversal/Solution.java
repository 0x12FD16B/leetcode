package cn.davidliu.leetcode.algorithms.binaryTreeLevelOrderTraversal;

import cn.davidliu.leetcode.algorithms.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal
 *
 * @author David Liu
 */
public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        List<List<Integer>> res = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> current = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                current.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(current);
        }

        return res;
    }
}
