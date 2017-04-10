package com.john.leetcode.app;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 30. Substring with Concatenation of All Words. You are given a string, s, and
 * a list of words, words, that are all of the same length. Find all starting
 * indices of substring(s) in s that is a concatenation of each word in words
 * exactly once and without any intervening characters.
 * 
 * For example, given: s: "barfoothefoobarman" words: ["foo", "bar"]
 * 
 * You should return the indices: [0,9].
 * 
 * @author wanyy257
 *
 */
public class Solution30 {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> result = new LinkedList<>();
		Map<String, Integer> map = new HashMap<>();
		int len = words[0].length();// each word length

		// put all words into map
		for (int i = 0; i < words.length; i++) {

			if (map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i]) + 1);

			} else {
				map.put(words[i], 1);
			}
		}

		// for testing
		System.out.println("map=" + map);

		for (int i = 0; i < s.length() - len * words.length; i++) {
			Map<String, Integer> temp = new HashMap<>(map);

			// check if match
			for (int j = 0; j < words.length; j++) {

				// next word
				String checkString = s.substring(i + j * len, i + j * len + len);
				// for test
				System.out.println("checkString=" + checkString);

				// it is in map
				if (map.containsKey(checkString)) {
					int count = temp.get(checkString);

					if (count == 1) {
						temp.remove(checkString);
						System.out.println("remove from map," + checkString);
					} else {
						temp.put(checkString, temp.get(checkString) - 1);
						System.out.println("update map, " + checkString);
					}

					// match
					if (temp.isEmpty()) {
						System.out.println("empty , adding i =" + i + " to list");
						result.add(i);
						break;
					}

				} else {
					// if it is not in the map
					System.out.println("it is not in the map, break");
					break;
				}

			}

		}

		return result;
	}

}
