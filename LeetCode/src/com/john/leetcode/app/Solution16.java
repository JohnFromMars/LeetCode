package com.john.leetcode.app;

import java.util.Arrays;

/**
 * 16. 3Sum Closest. Given an array S of n integers, find three integers in S
 * such that the sum is closest to a given number, target. Return the sum of the
 * three integers. You may assume that each input would have exactly one
 * solution.
 * 
 * @author wanyy257
 *
 */
public class Solution16 {
	public int threeSumClosest(int[] nums, int target) {

		int result = 0;
		int abs = Integer.MAX_VALUE;
		
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			int left = i + 1;
			int right = nums.length - 1;
			int sum = target - nums[i];

			while (left < right) {
				int check = nums[i] + nums[left] + nums[right];

				if (sum - nums[left] - nums[right] == 0) {
					return target;

				} else if (sum - nums[left] - nums[right] < 0) {

					if (Math.abs(target - check) < abs) {
						result = check;
						abs = Math.abs(target - check);
					}
					
					right--;

				} else {

					if (Math.abs(target - check) < abs) {
						result = check;
						abs = Math.abs(target - check);
					}
					
					left++;
				}
			}
		}

		return result;
	}
}
