package com.john.leetcode.app;

/**
 * 14. Longest Common Prefix example {"ac", "ac", "a", "a"} as a.
 * 
 * @author wanyy257
 *
 */
public class Solution13 {
	public String longestCommonPrefix(String[] strs) {
		String result = "";

		// empty input
		if (strs == null || strs.length == 0) {
			return result;
		}

		// not empty input
		// set first string as standard
		result = strs[0];

		// compare rest of strings and result
		for (int i = 1; i < strs.length; i++) {

			for (int j = 0; j < result.length(); j++) {

				if (result.charAt(j) != strs[i].charAt(j)) {
					result = result.substring(0, j);
					break;
				}
			}
		}

		return result;
	}
}
