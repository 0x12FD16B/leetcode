package cn.davidliu.leetcode.algorithms.binaryTreeLevelOrderTraversal;

import cn.davidliu.leetcode.algorithms.TreeNode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void levelOrder() {
        Assert.assertEquals(Collections.emptyList(), solution.levelOrder(null));
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(9);
        TreeNode node3 = new TreeNode(20);
        TreeNode node4 = new TreeNode(15);
        TreeNode node5 = new TreeNode(7);
        node1.left = node2;
        node1.right = node3;
        node3.left = node4;
        node3.right = node5;
        List<List<Integer>> expect = Arrays.asList(
                Collections.singletonList(3),
                Arrays.asList(9, 20),
                Arrays.asList(15, 7)
        );
        Assert.assertEquals(expect, solution.levelOrder(node1));
    }
}