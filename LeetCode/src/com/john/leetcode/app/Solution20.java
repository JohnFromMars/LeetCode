package com.john.leetcode.app;

import java.util.LinkedList;

/**
 * 20. Valid Parentheses. Given a string containing just the characters '(',
 * ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * @author user
 *
 */
public class Solution20 {

	public boolean isValid(String s) {
		LinkedList<Character> checkStack = new LinkedList<>();
		boolean result = true;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']') {
				System.out.println("last = " + checkStack.peekLast());
				if(checkStack.isEmpty()){
					return false;
				}
				char c = checkStack.removeLast();

				switch (s.charAt(i)) {
				case ')':
					result = result && (s.charAt(i) == ')' && c == '(');
					break;

				case ']':
					result = result && (s.charAt(i) == ']' && c == '[');
					break;

				case '}':
					result = result && (s.charAt(i) == '}' && c == '{');
					break;

				default:
					break;
				}

			} else {
				System.out.println("add s=" + s.charAt(i));
				checkStack.add(s.charAt(i));
				
			}
		}
		
		if(!checkStack.isEmpty()){
			return false;
		}

		return result;
	}
}
