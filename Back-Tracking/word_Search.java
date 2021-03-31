package BackTracking;

public class Word_Search_Khudse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] board = { { "A", "B", "C", "E" }, { "S", "F", "C", "S" }, { "A", "D", "E", "E" } };
	//	 String[][] board = { { "C", "A", "A" }, { "A", "A", "A" }, { "B", "C", "D" }
		// };
		 
		String word = "ABCCED";
		word = "SEE";
		boolean flag = false;

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.println(board[i][j] + "::----");
				if (board[i][j].equals(Character.toString(word.charAt(0)))) {
					// System.out.println("sahabdjh");
					System.out.println(board[i][j] + " =======-- ");
					boolean ans = check(board, word, i, j, new boolean[board.length][board[0].length], 0);
					System.out.println(ans);
					if (ans) 
						flag = true;
						System.out.println("true");
						break;
					
				}
				if(flag)
					break;
			}
			if(flag)
				break;
		}

	}

	private static boolean check(String[][] board, String word, int row, int col, boolean[][] bs, int index) {
		if (index == word.length()) {
			return true;
		}
		if (row < 0 || row >= board.length || col < 0 || col >= board[0].length) {
			return false;
		}
		if (bs[row][col] == true) {
			return false;
		}
		if (!board[row][col].equals(Character.toString(word.charAt(index)))) {
			return false;
		}
		bs[row][col] = true;
		if (check(board, word, row + 1, col, bs, index + 1)) {
			return true;
		}
		if (check(board, word, row - 1, col, bs, index + 1)) {
			return true;
		}

		if (check(board, word, row, col + 1, bs, index + 1)) {
			return true;
		}

		if (check(board, word, row, col - 1, bs, index + 1)) {
			return true;
		}

		bs[row][col] = false;

		return false;
	}

}
