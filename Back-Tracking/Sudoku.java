package BackTracking;

import java.util.ArrayList;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] arr = { { "5", "3", ".", ".", "7", ".", ".", ".", "." },
				{ "6", ".", ".", "1", "9", "5", ".", ".", "." }, { ".", "9", "8", ".", ".", ".", ".", "6", "." },
				{ "8", ".", ".", ".", "6", ".", ".", ".", "3" }, { "4", ".", ".", "8", ".", "3", ".", ".", "1" },
				{ "7", ".", ".", ".", "2", ".", ".", ".", "6" }, { ".", "6", ".", ".", ".", ".", "2", "8", "." },
				{ ".", ".", ".", "4", "1", "9", ".", ".", "5" }, { ".", ".", ".", ".", "8", ".", ".", "7", "9" } };

	//	for (int i = 0; i < arr.length; i++) {
		//	for (int j = 0; j < arr[0].length; j++) {
			//	System.out.print(arr[i][j] + " ");
			//}
			//System.out.println();
	//	}
		//System.out.println("**********");
		ArrayList<ArrayList<String>> bl = new ArrayList<ArrayList<String>>();
		sudoku(arr, 0, 0, 0, 81, bl, "");

		//System.out.println("yess");
		System.out.println(bl);

	}

	private static void sudoku(String[][] arr, int row, int col, int ntn, int tn, ArrayList<ArrayList<String>> bl,
			String ans) {
		// System.out.println(ans);
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[0].length; j++) {
		// System.out.print(arr[i][j] + " ");
		// }
		// System.out.println();
		// }

		// System.out.println("------------" + ntn);
		if (ntn == tn) {
			// System.out.println(ans);

			for (int i = 0; i < arr.length; i++) {
				ArrayList<String> list = new ArrayList<String>();

				for (int j = 0; j < arr[0].length; j++) {
					// sb.append(arr[i][j]);
					list.add(arr[i][j]);

					//System.out.print(arr[i][j] + " ");
				}
				bl.add(list);

				//System.out.println();
			}

			return;
		}
		if (col == arr[0].length) {
			ans = ans + "***";
			col = 0;
			row = row + 1;

		}
		if (row == arr.length) {
			return;
		}
		if (arr[row][col].equals(".")) {
			for (int i = 1; i <= arr.length; i++) {
				// System.out.println(i + "###########");

				if (issafe(arr, row, col, i)) {
					// System.out.println("hiii");
					arr[row][col] = Integer.toString(i);
					sudoku(arr, row, col + 1, ntn + 1, tn, bl, ans + arr[row][col]);
					arr[row][col] = ".";
				}

			}
		} else {
			sudoku(arr, row, col + 1, ntn + 1, tn, bl, ans + arr[row][col]);
		}

		// System.out.println("hii" + ntn);

	}

	private static boolean issafe(String[][] board, int row, int col, int i) {
		// row - horizonatlly

		// System.out.println(i + "^^^^^^^^");

		String str = Integer.toString(i);
		int r = row;
		int c = 0;

		while (c < board.length) {
			if (board[r][c].contentEquals(str)) {
				// System.out.println("hey");
				return false;

			}
			c++;
			;
		}

		// vertically - col
		r = 0;
		c = col;
		while (r < board.length) {
			if (board[r][c].contentEquals(str)) {
				// System.out.println("hello");
				return false;
			}

			r++;
		}

		// box check
		int rowstart = row - row % 3;

		int colstart = col - col % 3;

		for (int j = rowstart; j < rowstart + 3; j++) {
			for (int k = colstart; k < colstart + 3; k++) {
				if (board[j][k].contentEquals(str)) {
					// System.out.println("nanamste");
					return false;
				}
			}
		}

		// System.out.println("finalllyyy");
		return true;

	}

}
