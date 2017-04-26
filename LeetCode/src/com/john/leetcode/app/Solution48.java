package com.john.leetcode.app;

/**
 * 48. Rotate Image. You are given an n x n 2D matrix representing an image.
 * 
 * Rotate the image by 90 degrees (clockwise).
 * 
 * @author wanyy257
 *
 */
public class Solution48 {

	public void rotate(int[][] matrix) {

		// transpose the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				int temp = matrix[i][j];
				System.out.println("matrix[i][j]=" + matrix[i][j]);
				System.out.println("matrix[j][i]=" + matrix[j][i]);
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		// Then flip the matrix horizontally.
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < (matrix[0].length / 2); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix[0].length - j - 1];
				matrix[i][matrix[0].length - j - 1] = temp;

			}
		}
	}
}
