package com.john.leetcode.app;

/**
 * 27. Remove Element. Given an array and a value, remove all instances of that
 * value in place and return the new length.
 * 
 * @author user
 *
 */
public class Solution27 {

	public int removeElement(int[] nums, int val) {
		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[result] = nums[i];
				result++;
			}
		}

		return result;
	}
}
