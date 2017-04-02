package com.john.leetcode.app;

public class Solution9 {

	public boolean isPalindrome(int x) {
		String numberToCheck = String.valueOf(x);
		boolean result = true;

		for (int i = 0; i < numberToCheck.length(); i++) {
			result = result && (numberToCheck.charAt(i) == numberToCheck.charAt(numberToCheck.length() - i - 1));
		}

		return result;
	}

	public boolean isPalindrome2(int x) {
		int halfReverseNumber = 0;

		while (x > halfReverseNumber) {
			halfReverseNumber = halfReverseNumber * 10 + (x % 10);
			x = x / 10;

			System.out.println("halfReverseNumber=" + halfReverseNumber);
			System.out.println("                x=" + x);
		}

		return (x == halfReverseNumber || x == halfReverseNumber / 10);
	}

}
