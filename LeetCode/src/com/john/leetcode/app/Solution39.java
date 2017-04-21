package com.john.leetcode.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 39. Combination Sum. Given a set of candidate numbers (C) (without
 * duplicates) and a target number (T), find all unique combinations in C where
 * the candidate numbers sums to T.
 * 
 * The same repeated number may be chosen from C unlimited number of times.
 * 
 * Note: All numbers (including target) will be positive integers. The solution
 * set must not contain duplicate combinations. For example, given candidate set
 * [2, 3, 6, 7] and target 7,
 * 
 * @author wanyy257
 *
 */
public class Solution39 {

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> result = new LinkedList<>();

		Arrays.sort(candidates);// sort list

		backtrack(result, new LinkedList<>(), candidates, target, 0);

		return result;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {

		if (remain < 0) {
			System.out.println("return");
			return;
		}

		else if (remain == 0) {
			System.out.println("add tempList=" + tempList);
			list.add(new ArrayList<>(tempList));
		}

		else {
			for (int i = start; i < nums.length; i++) {
				System.out.println("add nums[i]=" + nums[i] + " to temp list");
				tempList.add(nums[i]);
				// not i + 1 because we can reuse same elements
				backtrack(list, tempList, nums, remain - nums[i], i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

	private void backtrack2(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {

		if (remain < 0) {
			return;

		} else if (remain == 0) {
			list.add(new ArrayList<>(tempList));

		} else {
			for (int i = start; i < nums.length; i++) {
				tempList.add(nums[i]);
				System.out.println("tempList=" + tempList);
				backtrack2(list, tempList, nums, remain - nums[i], i);
				tempList.remove(tempList.size()- 1);
			}
		}
	}
}
