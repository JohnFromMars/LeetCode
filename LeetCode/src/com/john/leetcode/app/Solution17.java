package com.john.leetcode.app;

import java.util.LinkedList;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number. Given a digit string, return all
 * possible letter combinations that the number could represent.
 * 
 * @author wanyy257
 *
 */
public class Solution17 {
	public List<String> letterCombinations(String digits) {

		LinkedList<String> result = new LinkedList<>();
		String[] mapping = { "0", "1", "abc", "def", "ghi", "jki", "mno", "pqrs", "tuv", "wxyz" };

		result.add("");

		for (int i = 0; i < digits.length(); i++) {
			int number = digits.charAt(i) - '0';

			while (result.peek().length() == i) {
				String string = result.pop();

				for (char s : mapping[number].toCharArray()) {
					result.add(string + s);
				}
			}
		}

		return result;
	}
}
