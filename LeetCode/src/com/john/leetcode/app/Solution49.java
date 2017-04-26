package com.john.leetcode.app;

import java.util.Arrays;
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

			Map<String, List<String>> collect = new HashMap<>();

			Arrays.sort(strs);

			for (int i = 0; i < strs.length; i++) {
				char[] characters = strs[i].toCharArray();
				Arrays.sort(characters);

				String ketString = String.valueOf(characters);
				System.out.println("ketString=" + ketString);

				if (collect.containsKey(ketString)) {
					System.out.println("find key");
					List<String> list = collect.get(ketString);
					list.add(strs[i]);
					collect.put(ketString, list);

				} else {
					System.out.println("not found");
					List<String> list = new LinkedList<>();
					list.add(strs[i]);
					collect.put(ketString, list);
				}
			}

			return new LinkedList<>(collect.values());
		}

	}
}
