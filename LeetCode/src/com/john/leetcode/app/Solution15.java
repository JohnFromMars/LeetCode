package com.john.leetcode.app;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 15. 3Sum. Given an array S of n integers, are there elements a, b, c in S such
 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 * 
 * @author wanyy257
 *
 */
public class Solution15 {
	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> resultSet = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {

			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int left = i + 1;
				int right = nums.length - 1;
				int sum = 0 - nums[i];

				while (left < right) {

					if (nums[left] + nums[right] == sum) {
						if (!resultSet.contains(Arrays.asList(nums[i], nums[left], nums[right]))) {
							resultSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
						}

						left++;
						right--;

					} else if (nums[left] + nums[right] < sum) {
						left++;

					} else {
						right--;
					}
				}
			}
		}

		return resultSet;
	}
}
