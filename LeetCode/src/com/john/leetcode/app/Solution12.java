package com.john.leetcode.app;

/**
 * 12. Integer to Roman
 * 
 * @author wanyy257
 *
 */
public class Solution12 {

	public String intToRoman(int num) {

		String[] i = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String[] x = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "LC" };
		String[] c = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] m = { "", "M", "MM", "MMM" };

		return m[num / 1000] + c[(num % 1000) / 10] + x[(num % 100) / 10] + i[num % 10];
	}

}
