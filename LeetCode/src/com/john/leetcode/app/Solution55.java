package com.john.leetcode.app;

import java.util.Arrays;

/*
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return true.

A = [3,2,1,0,4], return false.
 * 
 * 
 */
public class Solution55 {
	public static void main(String[] arg) {
		int[] array = { 2, 3, 1, 1, 4 };
		System.out.println(canJump(array));
	}

	public static boolean canJump(int[] nums) {
		int indicator = nums[0];
		int sum = nums[0];
		int size = nums.length - 1;
		
		if (sum == size) {
			return true;
		}
 
		// initial check
		else if (sum > size) {
			return false;
		}

		// special condition
		else if (sum == 0) {

			return false;
		}

		else {

			int[] subarray = Arrays.copyOfRange(nums, indicator, nums.length);
			return canJump(subarray);
		}

	}

}
