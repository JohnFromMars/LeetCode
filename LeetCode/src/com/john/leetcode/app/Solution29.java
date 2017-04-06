package com.john.leetcode.app;

/**
 * 29. Divide Two Integers. Divide two integers without using multiplication,
 * division and mod operator.
 * 
 * If it is overflow, return MAX_INT.
 * 
 * @author user
 *
 */
public class Solution29 {
	public int divide(int dividend, int divisor) {
		
		if (divisor == 0) {
			return Integer.MAX_VALUE;
		}

		int result = 0;
		int end = Math.abs(dividend);
		int di = Math.abs(divisor);

		System.out.println("end="+end);
		System.out.println("di="+di);
		
		if (end < di) {
			return 0;
		}
		
		while (end >= di) {
			result++;
			end = end - di;
		}

		if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
			return 0 - result;
		} else {
			return result;
		}
	}
}
