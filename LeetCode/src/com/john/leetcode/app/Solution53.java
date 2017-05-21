package com.john.leetcode.app;

/**
 * 53. Maximum Subarray. Find the contiguous subarray within an array
 * (containing at least one number) which has the largest sum.
 * 
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray
 * [4,-1,2,1] has the largest sum = 6.
 * 
 * @author wanyy257
 *
 */
public class Solution53 {
	public int maxSubArray(int[] nums) {
		int result = Integer.MIN_VALUE;
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {

			int temp = sumArray(nums, left, right);
			result = Math.max(result, temp);

			if (nums[left] < nums[right]) {
				left++;

			} else {
				right--;
			}
		}

		return result;
	}

	private int sumArray(int[] nums, int left, int right) {

		int result = 0;

		for (int i = left; i <= right; i++) {
			result = result + nums[i];
		}
		return result;
	}
}
