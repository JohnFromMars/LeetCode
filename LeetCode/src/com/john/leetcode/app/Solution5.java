package com.john.leetcode.app;

public class Solution5 {
	private int lo;
	private int maxLen;

	public String longestPalindrome(String s) {

		if (s.length() < 2) {
			return s;
		}

		for (int i = 0; i < s.length(); i++) {

			if (s.length() % 2 == 0) {
				extendPalindrome(s, i, i + 1);

			} else {
				extendPalindrome(s, i, i);
			}
		}

		return s.substring(lo, lo + maxLen);
	}

	private void extendPalindrome(String s, int leftBound, int rightBound) {

		while (leftBound >= 0 && rightBound < s.length() && s.charAt(rightBound) == s.charAt(leftBound)) {
			leftBound--;
			rightBound++;
		}

		if (maxLen < rightBound - leftBound - 1) {
			lo = leftBound + 1;
			maxLen = rightBound - leftBound - 1;
		}

	}
}
