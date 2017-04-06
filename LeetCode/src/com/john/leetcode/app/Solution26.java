package com.john.leetcode.app;

/**
 * 26. Remove Duplicates from Sorted Array. Given a sorted array, remove the
 * duplicates in place such that each element appear only once and return the
 * new length.
 * 
 * @author user
 *
 */
public class Solution26 {

	public int removeDuplicates(int[] nums) {
		int result = 1;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] > nums[i - 1]) {
				nums[result] = nums[i];
				result++;
			}
		}

		return result;
	}
}
