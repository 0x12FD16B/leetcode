package cn.davidliu.leetcode.algorithms.listOfDepthLCCI;

import cn.davidliu.leetcode.algorithms.ListNode;
import cn.davidliu.leetcode.algorithms.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/list-of-depth-lcci/
 *
 * @author David Liu
 */
public class Solution {

    public ListNode[] listOfDepth(TreeNode root) {
        if (root == null) return new ListNode[0];
        List<ListNode> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode dummyHead = new ListNode(0);
            ListNode prev = dummyHead, current = null;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                current = new ListNode(node.val);
                prev.next = current;
                prev = current;
            }
            res.add(dummyHead.next);
        }

        return res.toArray(new ListNode[0]);
    }

}
