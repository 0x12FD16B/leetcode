package cn.davidliu.leetcode.algorithms.validParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 *
 * @author David Liu
 */
public class Solution {

    public boolean isValid(String s) {
        Map<Character, Character> parenthesesPairMap = new HashMap<>();
        parenthesesPairMap.put('(', ')');
        parenthesesPairMap.put('[', ']');
        parenthesesPairMap.put('{', '}');
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (parenthesesPairMap.containsKey(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty() || parenthesesPairMap.get(stack.pop()) != ch) return false;
            }
        }

        return stack.isEmpty();
    }
}
