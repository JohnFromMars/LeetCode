package com.john.leetcode.app;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 32. Longest Valid Parentheses. Given a string containing just the characters
 * '(' and ')', find the length of the longest valid (well-formed) parentheses
 * substring.
 * 
 * For "(()", the longest valid parentheses substring is "()", which has length
 * = 2.
 * 
 * Another example is ")()())", where the longest valid parentheses substring is
 * "()()", which has length = 4.
 * 
 * @author wanyy257
 *
 */
public class Solution32 {

	public int longestValidParentheses2(String s) {
		Stack<Integer> stack = new Stack<>();
		int max = 0;
		stack.push(-1);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')' && stack.size() > 1 && s.charAt(stack.peek()) == '(') {
				stack.pop();
				max = Math.max(max, i - stack.peek());
			} else {
				stack.push(i);
			}
		}

		return max;
	}

	public int longestValidParentheses(String s) {
		int result = 0;
		int temp = 0;
		LinkedList<Character> stack = new LinkedList<>();
		List<Integer> resultSet = new LinkedList<>();

		for (int i = 0; i < s.length(); i++) {
			Character character = s.charAt(i);

			switch (character) {
			case '(':
				System.out.println("adding character=" + character + " to stack");
				stack.add(character);
				break;

			case ')':

				if (stack.peekLast() != null && stack.peekLast() == '(') {
					System.out.println("stack.peekLast()=" + stack.peekLast());
					stack.removeLast();
					temp = temp + 2;
					resultSet.add(temp);
					System.out.println(" current temp=" + temp);

				} else {
					System.out.println("adding temp=" + temp + " to resultSet");
					resultSet.add(temp);
					temp = 0;
					System.out.println(" current temp=" + temp);
				}

				break;

			default:
				break;
			}
		}

		System.out.println("loop finish current temp=" + temp);

		if (stack.isEmpty()) {
			System.out.println("adding last temp");
			resultSet.add(temp);
		}

		for (Integer i : resultSet) {
			System.out.println("result=" + result + ", i=" + i);
			result = Math.max(result, i);
		}

		return result;
	}

}
