package com.john.leetcode.app;

/**
 * 43. Multiply Strings. Given two non-negative integers num1 and num2
 * represented as strings, return the product of num1 and num2.
 * 
 * Note:
 * 
 * The length of both num1 and num2 is < 110. Both num1 and num2 contains only
 * digits 0-9. Both num1 and num2 does not contain any leading zero. You must
 * not use any built-in BigInteger library or convert the inputs to integer
 * directly.
 * 
 * @author wanyy257
 *
 */
public class Solution43 {

	public String multiply(String num1, String num2) {

		int m = num1.length();
		int n = num2.length();
		int[] pos = new int[m + n];

		for (int i = m - 1; i >= 0; i--) {
			System.out.println(" (num1.charAt(i) - '0')=" + (num1.charAt(i) - '0'));
			for (int j = n - 1; j >= 0; j--) {

				System.out.println(" (num2.charAt(j) - '0')=" + (num2.charAt(j) - '0'));
				int multiple = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				System.out.println("multiple = " + multiple);
				int p1 = i + j;
				int p2 = i + j + 1;

				System.out.println("pos[p2]=" + pos[p2]);
				
				int sum = multiple + pos[p2];
				System.out.println("sum=" + sum);
				
				pos[p1] = pos[p1] + (sum / 10);
				pos[p2] = pos[p2] + (sum % 10);
			}
		}

		StringBuilder sBuilder = new StringBuilder();

		for (int c : pos) {
			if(!(sBuilder.length() == 0 && c == 0)){
				sBuilder.append(c);
			}
		}

		return sBuilder.toString();
	}
}
