package com.john.leetcode.app;

/**
 * 10. Regular Expression Matching, Implement regular expression matching with
 * support for '.' and '*'. '.' Matches any single character. '*' Matches zero
 * or more of the preceding element.
 * 
 * @author wanyy257
 *
 */
public class Solution10 {
	public boolean isMatch(String s, String p) {
		// when input is null
		if (s == null || p == null) {
			return false;

			// when inputs are not null
		} else {

			boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

			// initial start is true
			dp[0][0] = true;

			// initial dp[0][i]
			for (int i = 1; i < p.length() + 1; i++) {

				if (p.charAt(i - 1) == '*') {
					if (dp[0][i - 1] || (i > 1 && dp[0][i - 2])) {
						dp[0][i] = true;
					}
				}
			}

			for (int i = 1; i < s.length() + 1; i++) {
				for (int j = 1; j < p.length() + 1; j++) {

					if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') {
						dp[i][j] = dp[i - 1][j - 1];
					}

					if (p.charAt(j - 1) == '*') {
						if (s.charAt(i - 1) != p.charAt(j - 2) && p.charAt(j - 2) != '.') {
							dp[i][j] = dp[i][j - 2];

						} else {
							dp[i][j] = dp[i - 1][j] || dp[i][j - 1] || dp[i][j - 2];
						}
					}
				}
			}

			return dp[s.length()][p.length()];
		}

	}
}
