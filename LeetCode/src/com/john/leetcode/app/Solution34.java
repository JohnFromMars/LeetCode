package com.john.leetcode.app;

/**
 * 34. Search for a Range. Given an array of integers sorted in ascending order,
 * find the starting and ending position of a given target value.
 * 
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * 
 * If the target is not found in the array, return [-1, -1].
 * 
 * For example, Given [5, 7, 7, 8, 8, 10] and target value 8, return [3, 4].
 * 
 * @author wanyy257
 *
 */
public class Solution34 {
	public int[] searchRange(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length - 1;
		int[] result = { -1, -1 };

		while (lo <= hi) {

			int mid = (lo + hi) / 2;
			System.out.println("lo =" + lo + ", hi=" + hi + ", mid=" + mid);

			if (target == nums[mid]) {
				if (nums[lo] == nums[hi]) {
					return result = addToArray(lo, hi);
				} else {
					hi--;
				}

			} else if (target <= nums[mid]) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}

		}

		return result;
	}

	private int[] addToArray(int a, int b) {

		int[] result;
		if (a != b) {
			int total = b - a + 1;
			result = new int[total];
			for (int i = 0; i < total; i++) {
				result[i] = i + a;
			}

			return result;

		} else {
			result = new int[2];
			result[0] = a;
			result[1] = a;
			return result;
		}

	}
}
