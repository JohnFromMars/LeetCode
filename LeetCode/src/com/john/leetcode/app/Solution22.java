package com.john.leetcode.app;

import java.util.LinkedList;
import java.util.List;

/**
 * 22. Generate Parentheses. Given n pairs of parentheses, write a function to
 * generate all combinations of well-formed parentheses.
 * 
 * @author wanyy257
 *
 */
public class Solution22 {

	public List<String> generateParenthesis(int n) {
		List<String> result = new LinkedList<>();

		generate("", n, n, result);

		return result;
	}

	private void generate(String prefix, int left, int right, List<String> result) {
		if (left == 0 && right == 0) {
			result.add(prefix);
		}

		if (left > 0) {
			generate(prefix + "(", left - 1, right, result);
		}

		if (left < right) {
			generate(prefix + ")", left, right - 1, result);
		}
	}

}
