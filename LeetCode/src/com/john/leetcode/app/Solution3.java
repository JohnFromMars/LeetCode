package com.john.leetcode.app;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {
		int result = 0;
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0, j = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				j = Math.max(j, map.get(s.charAt(i)) + 1);
			}

			map.put(s.charAt(i), i);
			result = Math.max(result, i - j + 1);
		}

		return result;
	}

}
