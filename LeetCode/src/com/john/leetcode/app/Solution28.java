package com.john.leetcode.app;

/**
 * 28. Implement strStr(). Returns the index of the first occurrence of needle
 * in haystack, or -1 if needle is not part of haystack.
 * 
 * @author user
 *
 */
public class Solution28 {
	public int strStr(String haystack, String needle) {
		int result = -1;

		for (int i = 0; i < haystack.length() - needle.length(); i++) {
			
			for (int j = 0; j < needle.length(); j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}

				if(j==needle.length()-1){
					return i;
				}
			}
		}

		return result;
	}
}
