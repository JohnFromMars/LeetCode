package com.john.leetcode.app;

/**
 * 42. Trapping Rain Water. Given n non-negative integers representing an
 * elevation map where the width of each bar is 1, compute how much water it is
 * able to trap after raining.
 * 
 * For example, Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 * 
 * @author wanyy257
 *
 */
public class Solution42 {

	public int trap(int[] height) {
		
		int a = 0;
		int b = height.length - 1;

		int max = 0;
		int leftMax = 0;
		int rightMax = 0;

		while (a <= b) {
			
			leftMax = Math.max(leftMax, height[a]);
			rightMax = Math.max(rightMax, height[b]);

			if (leftMax < rightMax) {
				max = max + (leftMax - height[a]);
				a++;

			} else {
				max = max + (rightMax - height[b]);
				b--;
			}
		}
		
		return max;
	}
}
