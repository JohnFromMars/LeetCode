package com.john.leetcode.app;

/**
 * 38. Count and Say. The count-and-say sequence is the sequence of integers
 * beginning as follows: 1, 11, 21, 1211, 111221, ...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211. Given an integer n, generate the nth
 * sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * @author wanyy257
 *
 */

public class Solution38 {

	public String countAndSay(int n) {
		StringBuilder current = new StringBuilder("1");
		StringBuilder previuse;

		int count;
		char say;

		for (int i = 1; i < n; i++) {
			previuse = current;
			current = new StringBuilder();
			count = 1;
			say = previuse.charAt(0);

			for (int j = 1, len = previuse.length(); j < len; j++) {
				if (previuse.charAt(j) != say) {
					current.append(count).append(say);
					count = 1;
					say = previuse.charAt(j);
				} else
					count++;
			}
			current.append(count).append(say);
		}
		return current.toString();

	}
}
