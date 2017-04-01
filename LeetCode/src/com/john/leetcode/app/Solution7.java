package com.john.leetcode.app;

public class Solution7 {
	public int reverse(int x) {

		String number = String.valueOf(x);
		String reverseNumber = "";
		int result = 0;

		// for positive number
		if (x >= 0) {

			for (int i = number.length() - 1; i >= 0; i--) {
				reverseNumber = reverseNumber + number.charAt(i);
			}

			// for negative number
		} else {

			reverseNumber = reverseNumber + "-";

			for (int i = number.length() - 1; i > 0; i--) {
				reverseNumber = reverseNumber + number.charAt(i);
			}

		}

		result = Integer.valueOf(reverseNumber);
		return result;
	}
}
