package com.john.leetcode.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 40. Combination Sum II. Given a collection of candidate numbers (C) and a
 * target number (T), find all unique combinations in C where the candidate
 * numbers sums to T.
 * 
 * Each number in C may only be used once in the combination.
 * 
 * Note: All numbers (including target) will be positive integers. The solution
 * set must not contain duplicate combinations.
 * 
 * @author wanyy257
 *
 */
public class Solution40 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> result = new LinkedList<>();

		Arrays.sort(candidates);

		backTrack(result, new LinkedList<>(), candidates, target, 0);

		return result;
	}

	private void backTrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain,
			int start) {
		if (remain < 0) {
			return;

		} else if (remain == 0) {
			result.add(new ArrayList<>(tempList));

		} else {
			for (int i = start; i < candidates.length; i++) {
				if (i > start && candidates[i] == candidates[i - 1])
					continue;

				tempList.add(candidates[i]);
				backTrack(result, tempList, candidates, remain - candidates[i], start + 1);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
