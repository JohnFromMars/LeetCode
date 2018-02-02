package com.john.leetcode.app;

/**
 * 53. Maximum Subarray. Find the contiguous subarray within an array
 * (containing at least one number) which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray
 * [4,-1,2,1] has the largest sum = 6.
 * 
 * solution121 is same algorithm
 * 
 * @author wanyy257
 *
 */
public class Solution53 {


	public int maxSubArray(int[] nums) {
		int maxSoFar = nums[0];
		int maxEndingHere = nums[0];

		for (int i = 1; i < nums.length; i++) {
			maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}
}