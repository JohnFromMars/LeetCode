package com.john.leetcode.app;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 47. Permutations II. Given a collection of numbers that might contain
 * duplicates, return all possible unique permutations.
 * 
 * For example, [1,1,2] have the following unique permutations: [ [1,1,2],
 * [1,2,1], [2,1,1] ]
 * 
 * @author wanyy257
 *
 */
public class Solution47 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();
		Arrays.sort(nums);
		backTrack(result, new LinkedList<>(), nums, new boolean[nums.length]);
		return result;
	}

	private void backTrack(List<List<Integer>> result, List<Integer> temp, int[] nums, boolean[] used) {
		if (temp.size() == nums.length) {
			result.add(new LinkedList<>(temp));

		} else {
			for (int i = 0; i < nums.length; i++) {
				if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
					continue;

				} else {
					temp.add(nums[i]);
					used[i] = true;
					backTrack(result, temp, nums, used);
					used[i] = false;
					temp.remove(temp.size() - 1);
				}
			}
		}
	}
}
