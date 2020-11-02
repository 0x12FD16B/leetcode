package cn.davidliu.leetcode.algorithms.listOfDepthLCCI;

import cn.davidliu.leetcode.algorithms.ListNode;
import cn.davidliu.leetcode.algorithms.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testListOfDepth() {
        Assert.assertArrayEquals(new ListNode[0], solution.listOfDepth(null));
        ListNode[] expect = new ListNode[]{
                new ListNode(1),
                new ListNode(2, new ListNode(3)),
                new ListNode(4, new ListNode(5, new ListNode(7))),
                new ListNode(8)
        };
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.right = treeNode7;
        treeNode4.left = treeNode8;
        ListNode[] actual = solution.listOfDepth(treeNode1);
        Assert.assertArrayEquals(expect, actual);
    }
}