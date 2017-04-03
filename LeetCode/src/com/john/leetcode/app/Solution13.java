package com.john.leetcode.app;

/**
 * 13. Roman to Integer
 * 
 * @author wanyy257
 *
 */
public class Solution13 {

	public int romanToInt(String s) {
		int result = 0;
		int index = s.length() - 1;

		while (index >= 0) {
			char c = s.charAt(index);

			switch (c) {
			case 'I':

				if (result >= 5) {
					result = result - 1;
				} else {
					result = result + 1;
				}

				break;

			case 'V':
				result = result + 5;
				break;

			case 'X':
				if (result >= 50) {
					result = result - 10;
				} else {
					result = result + 10;
				}

				break;

			case 'L':
				result = result + 50;
				break;

			case 'C':
				if (result >= 500) {
					result = result - 100;
				} else {
					result = result + 100;
				}

				break;

			case 'D':
				result = result + 500;
				break;

			case 'M':
				result = result + 1000;
				break;

			default:
				break;
			}

			index--;
		}

		return result;
	}
}
