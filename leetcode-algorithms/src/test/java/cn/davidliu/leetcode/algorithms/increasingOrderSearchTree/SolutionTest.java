package cn.davidliu.leetcode.algorithms.increasingOrderSearchTree;

import cn.davidliu.leetcode.algorithms.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testIncreasingBST() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node8 = new TreeNode(8);
        TreeNode node9 = new TreeNode(9);
        node1.right = node2;
        node2.right = node3;
        node3.right = node4;
        node4.right = node5;
        node5.right = node6;
        node6.right = node7;
        node7.right = node8;
        node8.right = node9;
        Assert.assertEquals(node1, solution.increasingBST(TreeNode.make(new Integer[]{5, 3, 6, 2, 4, null, 8, 1, null, null, null, null, null, 7, 9})));
        Assert.assertEquals(node1, solution.increasingBST_2(TreeNode.make(new Integer[]{5, 3, 6, 2, 4, null, 8, 1, null, null, null, null, null, 7, 9})));
    }
}