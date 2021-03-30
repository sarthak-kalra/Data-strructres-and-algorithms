package BackTracking;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		blockedmaze(maze, 0, 0, "", new boolean[4][4]);

		//
		// twoqueensper(new boolean[4], 0, 2, "");
		// twoqueenscom(new boolean[4], 0, 2, "", 0);
	}

	private static void blockedmaze(int[][] maze, int row, int col, String ans, boolean[][] bs) {
		// TODO Auto-generated method stub
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			// System.out.println("udbd");
			return;
		}
		if (row >= maze.length || col >= maze[0].length) {
			return;
		}
		if (row < 0 || col < 0) {
			return;
		}
		if (maze[row][col] == 1) {
			return;
		}
		if (bs[row][col] == true) {
			return;
		}

		bs[row][col] = true;
		blockedmaze(maze, row, col + 1, ans + "R", bs);

		blockedmaze(maze, row, col - 1, ans + "L", bs);

		blockedmaze(maze, row + 1, col, ans + "B", bs);

		blockedmaze(maze, row - 1, col, ans + "T", bs);
		bs[row][col] = false;

	}
