package com.john.leetcode.app;

/**
 * 31. Next Permutation. Implement next permutation, which rearranges numbers
 * into the lexicographically next greater permutation of numbers.
 * 
 * If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 * 
 * The replacement must be in-place, do not allocate extra memory.
 * 
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column. 1,2,3 → 1,3,2 3,2,1 →
 * 1,2,3 1,1,5 → 1,5,1
 * 
 * @author wanyy257
 *
 */
public class Solution31 {
	public void nextPermutation(int[] nums) {
		int index = nums.length - 1;

		while (index >= 0) {
			System.out.println("index=" + index);

			if (nums[index - 1] < nums[index]) {
				System.out.println("nums[" + (index - 1) + "]=" + nums[index - 1] + " ,nums[" + index + "]="
						+ nums[index] + " break");
				break;
			}

			index--;
		}

		if (index == 0) {
			System.out.println("index = 0, reverseSort!");
			reverseSort(nums, 0, nums.length - 1);
			return;

		} else {
			int val = nums[index - 1];
			int j = nums.length - 1;

			while (j >= index) {
				if (nums[j] > val) {
					break;
				}

				j--;
			}

			swap(nums, j, index - 1);
			reverseSort(nums, index, nums.length - 1);
			return;
		}

	}

	private void swap(int[] nums, int a, int b) {
		System.out.println("swap a=" + a + ", b=" + b);
		int temp = 0;
		temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
	}

	private void reverseSort(int[] nums, int start, int end) {
		if (start > end) {
			System.out.println("start=" + start + ", end=" + end + " , RETURN");
			return;

		} else {
			for (int i = start; i < (start + end) / 2; i++) {
				swap(nums, i, start + end - i);
			}
		}
	}
}
