package com.john.leetcode.app;

/**
 * 
 * Give up!!!!!!!!!!!!!!!!!
 * 41. First Missing Positive. Given an unsorted integer array, find the first
 * missing positive integer.
 * 
 * For example, Given [1,2,0] return 3, and [3,4,-1,1] return 2.
 * 
 * Your algorithm should run in O(n) time and uses constant space.
 * 
 * solution: The basic idea is for any k positive numbers (duplicates allowed),
 * the first missing positive number must be within [1,k+1]. The reason is like
 * you put k balls into k+1 bins, there must be a bin empty, the empty bin can
 * be viewed as the missing number.
 * 
 * @author wanyy257
 *
 */
public class Solution41 {

	public int firstMissingPositive(int[] nums) {
		int result = nums.length + 1;
		int maxValue =  nums.length;

		for (int i = 0; i < maxValue; i++) {
			if (nums[i] > 0 && nums[i] < result) {
				result = Math.min(result, nums[i] + 1);
			}
		}

		return result+1;
	}

}