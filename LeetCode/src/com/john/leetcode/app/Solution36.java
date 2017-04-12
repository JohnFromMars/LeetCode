package com.john.leetcode.app;

import java.util.HashSet;

/**
 * 36. Valid Sudoku. Determine if a Sudoku is valid, according to: Sudoku
 * Puzzles - The Rules.
 * 
 * The Sudoku board could be partially filled, where empty cells are filled with
 * the character '.'.
 * 
 * @author wanyy257
 *
 */
public class Solution36 {
	public boolean isValidSudoku(char[][] board) {
		boolean result = true;

		for (int i = 0; i < 9; i++) {
			HashSet<Character> columns = new HashSet<>();
			HashSet<Character> cube = new HashSet<>();
			HashSet<Character> rows = new HashSet<>();

			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.' && !rows.add(board[i][j])) {
					return false;
				}

				if (board[j][i] != '.' && !columns.add(board[j][i])) {
					return false;
				}

				int rowIndex = 3 * (i / 3) + (j / 3);
				int columnIndex = 3 * (i % 3) + (j % 3);

				System.out.println("i=" + i + ", j=" + j + ", rowIndex=" + rowIndex + ", columnIndex=" + columnIndex);

				if (board[rowIndex][columnIndex] != '.' && !cube.add(board[rowIndex][columnIndex])) {
					return false;
				}
			}

		}

		return result;
	}

}
