package cn.davidliu.leetcode.algorithms;

/**
 * Definition for a binary tree node.
 *
 * @author David Liu
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode make(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        TreeNode[] treeNodes = new TreeNode[values.length];
        treeNodes[0] = root;
        for (int i = 0; i < values.length; i++) {
            TreeNode current = treeNodes[i];
            int leftChildPos = i * 2 + 1;
            int rightChildPos = i * 2 + 2;
            if (leftChildPos < values.length) {
                if (values[leftChildPos] != null) {
                    TreeNode left = new TreeNode(values[leftChildPos]);
                    current.left = left;
                    treeNodes[leftChildPos] = left;
                } else {
                    treeNodes[leftChildPos] = null;
                }
            }
            if (rightChildPos < values.length) {
                if (values[rightChildPos] != null) {
                    TreeNode right = new TreeNode(values[rightChildPos]);
                    current.right = right;
                    treeNodes[rightChildPos] = right;
                } else {
                    treeNodes[rightChildPos] = null;
                }
            }
        }
        return root;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val) return false;
        if (left != null ? !left.equals(treeNode.left) : treeNode.left != null) return false;
        return right != null ? right.equals(treeNode.right) : treeNode.right == null;
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }
}
