package com.john.leetcode.app;

public class Solution8 {

	public int myAtoi(String str) {
		int result = 0;
		int index = 0;
		int sighn = 1;

		// 1. empty string
		if (str.length() == 0) {
			return 0;
		}

		// 2. remove space
		while (index < str.length() && str.charAt(index) == ' ') {
			index++;
		}

		// 3. handle sign
		if (str.charAt(index) == '+' || str.charAt(index) == '-') {
			if (str.charAt(index) == '-') {
				sighn = -1;
			}

			index++;
		}

		// 4. covert number
		while (index < str.length()) {
			int digit = str.charAt(index) - '0';
			System.out.println("digit=" + digit);

			// 5.check if character is numeric
			if (digit < 0 || digit > 9) {
				break;
			}

			// 6. number is over flow
			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE && digit > Integer.MAX_VALUE % 10)) {

				if (sighn == 1) {
					return Integer.MAX_VALUE;
				} else {
					return Integer.MIN_VALUE;
				}
			}

			result = 10 * result + digit;
			index++;
		}

		return result * sighn;

	}

}
