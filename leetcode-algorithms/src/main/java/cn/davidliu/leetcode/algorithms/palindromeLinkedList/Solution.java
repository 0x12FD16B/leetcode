package cn.davidliu.leetcode.algorithms.palindromeLinkedList;

import cn.davidliu.leetcode.algorithms.ListNode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/palindrome-linked-list/
 *
 * @author David Liu
 */
public class Solution {
    // 解法一: 构造反向链表, 对比反向链表和原链表中的每个节点
    // 时间复杂度: O(N)
    // 空间复杂度: O(N)
    public boolean isPalindrome_using_reverse_list(ListNode head) {
        if (head == null || head.next == null) return true;
        int length = 0;
        ListNode reversedDummy = new ListNode(-1);

        for (ListNode node = head; node != null; node = node.next) {
            length++;
            ListNode temp = reversedDummy.next;
            ListNode insert = new ListNode(node.val);
            reversedDummy.next = insert;
            insert.next = temp;
        }

        ListNode reversed = reversedDummy.next;

        for (int i = length; i > 0; i--) {
            if (reversed.val != head.val) {
                return false;
            }
        }

        return true;
    }

    // 解法二: 顺序遍历链表, 借助栈
    // 时间复杂度: O(N)
    // 空间复杂度: O(N)
    public boolean isPalindrome_with_stack(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        for (ListNode p = head; p != null; p = p.next) {
            stack.push(p.val);
        }

        for (ListNode p = head; p != null; p = p.next) {
            if (p.val != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // 解法三: 快慢指针遍历链表, 慢指针一边遍历链表, 一边反转
    // 时间复杂度: O(N)
    // 空间复杂度: O(1)
    public boolean isPalindrome_with_half_reserve(ListNode head) {
        if (head == null || head.next == null) return true;

        if (head.next.next == null) return head.val == head.next.val;

        ListNode slow = head, fast = head, prev = null;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            ListNode slowNext = slow.next;
            slow.next = prev;
            prev = slow;
            slow = slowNext;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null && prev != null) {
            if (slow.val != prev.val) {
                return false;
            }
            slow = slow.next;
            prev = prev.next;
        }

        return true;
    }
}
