package cn.davidliu.leetcode.algorithms.nAryTreePreorderTraversal;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void testPreorder() {
        Solution.Node node1 = new Solution.Node(1);
        Solution.Node node2 = new Solution.Node(2);
        Solution.Node node3 = new Solution.Node(3);
        Solution.Node node4 = new Solution.Node(4);
        Solution.Node node5 = new Solution.Node(5);
        Solution.Node node6 = new Solution.Node(6);
        node6.children = Arrays.asList(null, null);
        node1.children = Arrays.asList(node3, node2, node4);
        node3.children = Arrays.asList(node5, node6);
        List<Integer> expect = Arrays.asList(1, 3, 5, 6, 2, 4);
        Assert.assertEquals(expect, solution.preorder_recursion(node1));
        Assert.assertEquals(expect, solution.preorder_iteration(node1));
        Assert.assertEquals(new ArrayList<>(), solution.preorder_iteration(null));
    }

}