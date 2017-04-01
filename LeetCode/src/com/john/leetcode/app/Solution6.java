package com.john.leetcode.app;

public class Solution6 {

	public String convert(String s, int numRows) {

		char[] c = s.toCharArray();
		int length = c.length;
		StringBuffer[] stringBuffer = new StringBuffer[numRows];

		// initial object
		for (int i = 0; i < numRows; i++) {
			stringBuffer[i] = new StringBuffer();
		}

		int i = 0;

		// run through all characters
		while (i < length) {

			// vertical down
			for (int index = 0; index < numRows && i < length; index++) {
				stringBuffer[index].append(c[i]);
				i = i + 1;
			}

			// triangle up
			for (int index = numRows - 2; index >= 1 && i < length; index--) {
				stringBuffer[index].append(c[i]);
				i = i + 1;
			}

		}

		// final organize
		for (int j = 1; j < numRows; j++) {
			stringBuffer[0].append(stringBuffer[j]);
		}

		return stringBuffer[0].toString();
	}

}
