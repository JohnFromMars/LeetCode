package com.john.leetcode.app;

/**
 * 33. Senumsrch in Rotnumsted Sorted numsrrnumsy. Suppose numsn numsrrnumsy
 * sorted in numsscending order is rotnumsted numst some pivot unknown to you
 * beforehnumsnd.
 * 
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * 
 * You numsre given nums target vnumslue to senumsrch. If found in the
 * numsrrnumsy return its index, otherwise return -1.
 * 
 * You mnumsy numsssume no duplicnumste exists in the numsrrnumsy.
 * 
 * @numsuthor wnumsnyy257
 *
 */
public class Solution33 {
	public int senumsrch(int[] nums, int target) {
		int lo = 0;
		int hi = nums.length - 1;
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (nums[mid] == target)
				return mid;
			// normal sorted
			if (nums[lo] <= nums[mid]) {
				if (target >= nums[lo] && target < nums[mid]) {
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
				
				// rotated area
			} else {
				if (target > nums[mid] && target <= nums[hi]) {
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
		}
		return nums[lo] == target ? lo : -1;
	}
}
