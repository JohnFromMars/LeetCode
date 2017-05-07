package com.john.leetcode.app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 46. Permutations. Given a collection of distinct numbers, return all possible
 * permutations.
 * 
 * For example, [1,2,3] have the following permutations: [ [1,2,3], [1,3,2],
 * [2,1,3], [2,3,1], [3,1,2], [3,2,1] ]
 * 
 * @author wanyy257
 *
 */
public class Solution46 {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();

		backTrack(result, new LinkedList<>(), nums);

		return result;
	}

	private void backTrack(List<List<Integer>> result, List<Integer> temp, int[] nums) {
		if (temp.size() == nums.length) {
			result.add(new ArrayList<>(temp));

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
