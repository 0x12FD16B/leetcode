package cn.davidliu.leetcode.algorithms.maximumDepthOfBinaryTree;

import cn.davidliu.leetcode.algorithms.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void maxDepth() {
        Assert.assertEquals(0, solution.maxDepth(null));
        Assert.assertEquals(1, solution.maxDepth(new TreeNode(1)));
    }
}