package com.john.leetcode.app;

/**
 * 37. Sudoku Solver. Write a program to solve a Sudoku puzzle by filling the
 * empty cells.
 * 
 * Empty cells are indicated by the character '.'.
 * 
 * You may assume that there will be only one unique solution.
 * 
 * @author wanyy257
 *
 */
public class Solution37 {

	public void solveSudoku(char[][] board) {
		if (board == null || board.length == 0) {
			return;
		}

		solve(board);
	}

	public boolean solve(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == '.') {
					for (char c = '1'; c <= '9'; c++) {// trial. Try 1 through 9
						if (isValid(board, i, j, c)) {
							board[i][j] = c; // Put c for this cell

							if (solve(board)) {
								return true; // If it's the solution return true
							} else {
								board[i][j] = '.'; // Otherwise go back
							}
						}
					}

					return false;// if all fail return false
				}
			}
		}

		return true;
	}

	private boolean isValid(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) {
			if (board[i][col] != '.' && board[i][col] == c)
				return false; // check row
			if (board[row][i] != '.' && board[row][i] == c)
				return false; // check column
			if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
					&& board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
				return false; // check 3*3 block
		}
		return true;
	}

	public boolean solve2(char[][] board) {

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {

				if (board[i][j] == '.') {
					for (char c = '1'; c <= '9'; c++) {
						System.out.println("checking c=" + c);

						if (isValid2(board, i, j, c)) {

							System.out.println("c=" + c + " is valid, puc c into cell");
							board[i][j] = c;// set the board

							if (solve2(board)) {
								System.out.println("board valaid, return true");
								return true;

							} else {
								System.out.println("board is not valid , put . back");
								board[i][j] = '.';// set the board back
							}
						}
					}

					return false;
				}
			}
		}

		return true;
	}

	/**
	 * check whether it is valid through column , row and cub
	 * 
	 * @param board
	 * @param col
	 * @param row
	 * @param c
	 * @return
	 */
	private boolean isValid2(char[][] board, int row, int col, char c) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][col] != '.' && board[i][col] == c)
					return false; // check row
				if (board[row][i] != '.' && board[row][i] == c)
					return false; // check column
				if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] != '.'
						&& board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
					return false; // check 3*3 block
			}
		}

		return true;
	}

}
