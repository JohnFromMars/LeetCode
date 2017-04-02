package com.john.leetcode.app;

/**
 * 11. Container With Most Water
 * 
 * @author wanyy257
 *
 */
public class Solution11 {

	public int maxArea(int[] height) {
		int leftBound = 0;
		int rightBound = height.length - 1;
		int maxArea = 0;

		while (leftBound < rightBound) {

			System.out.println("leftBound =" + leftBound);
			System.out.println("rightBound=" + rightBound);

			maxArea = Math.max(maxArea, Math.min(height[leftBound], height[rightBound]) * (rightBound - leftBound));

			if (height[leftBound] <= height[rightBound]) {
				leftBound++;

			} else {
				rightBound--;
			}

		}

		return maxArea;
	}
}
