package com.john.leetcode.app;

/**
 * 50. Pow(x, n). Implement pow(x, n).
 * 
 * @author wanyy257
 *
 */
public class Solution50 {
	public double myPow(double x, int n) {
		double result = 1;

		if (n > 0) {
			for (int i = 0; i < n; i++) {
				result = result * x;
			}
		} else if (n == 0) {
			return 1;

		} else {
			n = -n;
			for (int i = 0; i < n; i++) {
				result = result / x;
			}
		}

		return result;
	}
}
