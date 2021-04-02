package BackTracking;

import java.util.ArrayList;

public class N_queens_leetcode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board = new String[5][5];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = ".";
			}

		}

		ArrayList<ArrayList<String>> bl = new ArrayList<ArrayList<String>>();
		Nqueenplacebox2d(new boolean[5][5], 0, 0, 0, 5, "", board, bl);
		System.out.println(bl);

	}

	public static int count = 0;

	private static void Nqueenplacebox2d(boolean[][] bs, int row, int col, int qtn, int tq, String ans,
			String[][] board, ArrayList<ArrayList<String>> bl) {
		// System.out.println(ans);
		// System.out.println("--");
		if (qtn == tq) {
			System.out.println(++count + "" + ans);
			ArrayList<String> list = new ArrayList<String>();
			String str = "";
			
			for (int i = 0; i < board.length; i++) {
				StringBuilder sb = new StringBuilder();
				
				for (int j = 0; j < board[0].length; j++) {
					sb.append(board[i][j]);

					System.out.print(board[i][j] + " ");
				}
				list.add(sb.toString());
				

				System.out.println();
			}
			
			bl.add(list);
			return;
		}
		if (col == bs[0].length) {
			row = row + 1;
			col = 0;
		}

		if (row == bs.length) {
			return;
		}

		// YES
		if (issafe(bs, row, col)) {
			bs[row][col] = true;
			board[row][col] = "Q";
			Nqueenplacebox2d(bs, row, col + 1, qtn + 1, tq, ans + "{" + row + " " + col + "}", board, bl);
			bs[row][col] = false;
			board[row][col] = ".";
		}
		Nqueenplacebox2d(bs, row, col + 1, qtn, tq, ans, board, bl);

	}

	private static boolean issafe(boolean[][] board, int row, int col) {
		int r = row - 1;
		int c = col;

		while (r >= 0) {
			if (board[r][c]) {
				return false;

			}
			r--;
		}
		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}

			c--;
		}
		// diagonal left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
		// diagonal right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}

			r--;
			c++;
		}
		return true;
	}

}
