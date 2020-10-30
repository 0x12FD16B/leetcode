package cn.davidliu.leetcode.algorithms.nAryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
 *
 * @author David Liu
 */
public class Solution {
    public List<Integer> preorder_recursion(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(res, root);
        return res;
    }

    public List<Integer> preorder_iteration(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            Node node = stack.pop();
            res.add(node.val);
            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    if (node.children.get(i) != null)
                        stack.push(node.children.get(i));
                }
            }
        }
        return res;
    }

    private void dfs(List<Integer> res, Node node) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                dfs(res, child);
            }
        }
    }


    public static class Node {
        public int val;

        public List<Node> children;

        public Node(int _val) {
            this.val = _val;
        }
    }
}
