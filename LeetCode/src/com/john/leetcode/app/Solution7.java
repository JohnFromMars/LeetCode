package com.john.leetcode.app;

public class Solution7 {
	public int reverse(int x) {

		String number = String.valueOf(x);
		StringBuilder reverseNumber = new StringBuilder();
		int result = 0;

		// for positive number
		if (x >= 0) {

			for (int i = number.length() - 1; i >= 0; i--) {
				reverseNumber.append(number.charAt(i));
			}

			// for negative number
		} else {

			reverseNumber.append("-");

			for (int i = number.length() - 1; i > 0; i--) {
				reverseNumber.append(number.charAt(i));
			}

		}

		result = Integer.valueOf(reverseNumber.toString());
		return result;
	}
}
