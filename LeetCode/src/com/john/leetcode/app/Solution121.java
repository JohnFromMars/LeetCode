package com.john.leetcode.app;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * If you were only permitted to complete at most one transaction (ie, buy one
 * and sell one share of the stock), design an algorithm to find the maximum
 * profit.
 * 
 * Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5
 * 
 * max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger
 * than buying price)
 * 
 * Example 2: Input: [7, 6, 4, 3, 1] Output: 0
 * 
 * In this case, no transaction is done, i.e. max profit = 0.
 * 
 * solution 53 is same algorithm
 * 
 * @author wanyy257
 *
 */
public class Solution121 {

	public int maxProfit(int[] prices) {
		int maxProfit = 0;
		int maxCur = 0;

		for (int i = 1; i < prices.length; i++) {
			System.out.println("prices[i] = " + prices[i] + ", prices[i-1] = " + prices[i - 1]);
			maxCur = Math.max(0, maxCur = maxCur + prices[i] - prices[i - 1]);
			System.out.println("maxProfit=" + maxProfit + ", maxCur=" + maxCur);
			maxProfit = Math.max(maxCur, maxProfit);
			System.out.println("final maxprofit=" + maxProfit);
		}

		return maxProfit;
	}
}
