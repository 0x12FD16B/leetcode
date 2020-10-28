package cn.davidliu.leetcode.algorithms.permutations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/permutations/
 *
 * @author David Liu
 */
public class Solution {

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) return Collections.emptyList();
        List<List<Integer>> res = new ArrayList<>();
        dfs(res, nums, new boolean[nums.length], new ArrayList<>());
        return res;
    }

    private void dfs(List<List<Integer>> res, int[] nums, boolean[] visited, List<Integer> state) {
        if (state.size() == nums.length) {
            res.add(new ArrayList<>(state));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            state.add(nums[i]);
            dfs(res, nums, visited, state);
            state.remove(state.size() - 1);
            visited[i] = false;
        }
    }

}
