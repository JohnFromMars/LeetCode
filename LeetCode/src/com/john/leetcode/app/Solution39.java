package com.john.leetcode.app;

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
		System.out.println("after sort=" + candidates);
 
		for (int i = 0; i < candidates.length; i++) {
			for (int j = i + 1; j < candidates.length; j++) {

			}

		}

		return result;
	}

}
