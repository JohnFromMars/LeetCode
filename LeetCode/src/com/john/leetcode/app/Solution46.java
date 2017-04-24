package com.john.leetcode.app;

import java.util.LinkedList;
import java.util.List;

public class Solution46 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();
		
		backTrack(result, new LinkedList<>(), nums);

		return result;
	}

	private void backTrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
		if (temp.size() == nums.length) {
			result.add(temp);

		} else {

			for (int i = 0; i < nums.length; i++) {
				if (temp.contains(nums[i])) {
					continue;

				} else {
					temp.add(nums[i]);
					backTrack(result, temp, nums);
					temp.remove(temp.size() - 1);
				}
			}
		}
	}
}
