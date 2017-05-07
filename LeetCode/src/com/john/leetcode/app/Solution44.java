package com.john.leetcode.app;

/**
 * Implement wildcard pattern matching with support for '?' and '*'. '?' Matches
 * any single character. '*' Matches any sequence of characters (including the
 * empty sequence).
 * 
 * The matching should cover the entire input string (not partial).
 * 
 * The function prototype should be: bool isMatch(const char *s, const char *p)
 * 
 * Some examples: isMatch("aa","a") → false isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false isMatch("aa", "*") → true isMatch("aa", "a*") →
 * true isMatch("ab", "?*") → true isMatch("aab", "c*a*b") → false
 * 
 * @author wanyy257
 *
 */
public class Solution44 {

	public boolean isMatch(String s, String p) {

		boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];

		// initial dp
		dp[s.length()][p.length()] = true;

		for (int i = p.length() - 1; i >= 0; i--) {
			if (p.charAt(i) != '*') {
				break;

			} else {
				dp[s.length()][i] = true;
			}
		}

		// loop for dp
		for (int i = s.length() - 1; i >= 0; i--) {
			for (int j = p.length() - 1; j >= 0; j--) {

				if (p.charAt(j) == '*') {
					dp[i][j] = dp[i][j + 1] || dp[i + 1][j];

				} else if (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?') {
					dp[i][j] = dp[i + 1][j + 1];
				}
			}
		}

		return dp[0][0];
	}
}
