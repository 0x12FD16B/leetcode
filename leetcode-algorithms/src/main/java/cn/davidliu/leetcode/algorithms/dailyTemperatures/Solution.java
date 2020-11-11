package cn.davidliu.leetcode.algorithms.dailyTemperatures;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode.com/problems/daily-temperatures/
 *
 * @author David Liu
 */
public class Solution {

    // 枚举每天的气温, 获取对应的结果
    // 时间复杂度: O(N ^ 2)
    // 空间复杂度: O(N)
    public int[] dailyTemperatures_bruceForce(int[] T) {
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int r = 0;
            for (int j = i + 1; j < T.length; j++) {
                if (T[j] > T[i]) {
                    r = j - i;
                    break;
                }
            }
            res[i] = r;
        }
        return res;
    }

    // 使用单调栈记录气温记录, 枚举每天的气温, 当栈中存在比当前气温低的元素, 计算气温差异, 否则, 将元素入栈
    // 时间复杂度: O(N)
    // 空间复杂度: O(N)
    public int[] dailyTemperatures_serialStack(int[] T) {
        int[] res = new int[T.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < T.length; i++) {
            while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                int d = stack.pop();
                res[d] = i - d;
            }
            stack.push(i);
        }
        return res;
    }
}
