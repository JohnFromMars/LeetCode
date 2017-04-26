package com.john.leetcode.app;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 * 49. Group Anagrams.Given an array of strings, group anagrams together.
 * 
 * For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], Return:
 * 
 * [ ["ate", "eat","tea"], ["nat","tan"], ["bat"] ]
 * 
 * @author wanyy257
 *
 */
public class Solution49 {
	public List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null) {
			return null;

		} else {
			List<List<String>> result = new LinkedList<>();
			Map<Integer, List<String>> collect = new HashMap<>();

			for (int i = 0; i < strs.length; i++) {
				Integer integer = new Integer(1);

				for (int j = 0; j < strs[i].length(); j++) {
					integer = integer * strs[i].charAt(j);
				}

				if (collect.containsKey(integer)) {
					List<String> list = collect.get(integer);
					list.add(strs[i]);
					collect.put(integer, list);

				} else {
					List<String> list = new LinkedList<>();
					list.add(strs[i]);
					collect.put(integer, list);
				}
			}

			for (List<String> c : collect.values()) {
				result.add(c);
			}

			return result;
		}

	}
}
