package com.john.leetcode.app;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * For example, Given the following matrix:
 * 
 * [ [ 1, 2, 3 ], [ 4, 5, 6 ], [ 7, 8, 9 ] ]
 * 
 * @author wanyy257
 *
 */
public class Solution54 {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();

		if (matrix.length == 0) {
			return result;
		}

		int rowBegin = 0;
		int colBegin = 0;
		int rowEnd = matrix.length - 1;
		int colEnd = matrix[0].length - 1;

		while (rowBegin <= rowEnd && colBegin <= colEnd) {

		}

		return result;
	}
}
