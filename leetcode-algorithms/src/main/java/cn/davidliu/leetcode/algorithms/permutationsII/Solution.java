package cn.davidliu.leetcode.algorithms.permutationsII;

import java.util.*;

/**
 * https://leetcode.com/problems/permutations-ii/
 *
 * @author David Liu
 */
public class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
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
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || set.contains(nums[i])) continue;
            set.add(nums[i]);
            state.add(nums[i]);
            visited[i] = true;
            dfs(res, nums, visited, state);
            visited[i] = false;
            state.remove(state.size() - 1);
        }
    }

}
