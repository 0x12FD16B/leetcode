package cn.davidliu.leetcode.algorithms;

import org.junit.Assert;
import org.junit.Test;

public class TreeNodeTest {

    @Test
    public void testTreeMake() {
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4);
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2);
        n5.left = n4;
        n4.left = n1;
        n4.right = n3;
        n3.left = n2;
        Assert.assertEquals(n5, TreeNode.make(new Integer[]{5, 4, null, 1, 3, null, null, null, null, 2}));
        Assert.assertNull(TreeNode.make(null));
        Assert.assertNull(TreeNode.make(new Integer[0]));
    }


    @Test
    public void testEqualsAndHashCode() {
        TreeNode t1n4 = new TreeNode(4);
        t1n4.left = new TreeNode(1);
        t1n4.right = new TreeNode(2);
        TreeNode t2n4 = new TreeNode(4);
        t2n4.left = new TreeNode(1);
        t2n4.right = new TreeNode(2);
        TreeNode t3n4 = new TreeNode(3);
        TreeNode t4n4 = new TreeNode(4);
        t4n4.left = new TreeNode(2);
        TreeNode t5n4 = new TreeNode(4);
        Assert.assertEquals(t1n4, t1n4);
        Assert.assertNotEquals(t1n4, new Object());
        Assert.assertNotEquals(t1n4, null);
        Assert.assertNotEquals(t3n4, t1n4);
        Assert.assertNotEquals(t1n4, t4n4);
        Assert.assertNotEquals(t1n4, t5n4);
        Assert.assertEquals(t1n4, t2n4);
        Assert.assertEquals(t1n4.hashCode(), t2n4.hashCode());
    }
}