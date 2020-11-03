package cn.davidliu.leetcode.algorithms.maximumBinaryTreeII;

import cn.davidliu.leetcode.algorithms.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testInsertIntoMaxTree() {
        TreeNode expect = TreeNode.make(new Integer[]{5, 4, null, 1, 3, null, null, null, null, 2});
        TreeNode actual = solution.insertIntoMaxTree(TreeNode.make(new Integer[]{4, 1, 3, null, null, 2}), 5);
        Assert.assertEquals(expect, actual);
        Assert.assertEquals(new TreeNode(1), solution.insertIntoMaxTree(null, 1));
        Assert.assertEquals(TreeNode.make(new Integer[]{5, 2, 4, null, 1, null, 3}), solution.insertIntoMaxTree(TreeNode.make(new Integer[]{5, 2, 4, null, 1}), 3));
    }

}