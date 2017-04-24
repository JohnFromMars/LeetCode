package com.john.leetcode.app;

/**
 * 45. Jump Game II. Given an array of non-negative integers, you are initially
 * positioned at the first index of the array.
 * 
 * Each element in the array represents your maximum jump length at that
 * position.
 * 
 * Your goal is to reach the last index in the minimum number of jumps.
 * 
 * For example: Given array A = [2,3,1,1,4]
 * 
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from
 * index 0 to 1, then 3 steps to the last index.)
 * 
 * Note: You can assume that you can always reach the last index.
 * 
 * @author wanyy257
 *
 */
public class Solution45 {

	public int jump(int[] nums) {
		int stepCount = 0;
		int lastMax = 0;
		int curentMax = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			System.out.println("stepCount=" + stepCount);
			System.out.println("lastMax=" + lastMax);
			System.out.println("curentMax=" + curentMax);
			System.out.println("i + nums[i]=" + (i + nums[i]));

			curentMax = Math.max(curentMax, i + nums[i]);

			if (i == lastMax) {
				System.out.println("i=lastMax");
				stepCount++;
				lastMax = curentMax;
			}
		}
		return stepCount;
	}

}
