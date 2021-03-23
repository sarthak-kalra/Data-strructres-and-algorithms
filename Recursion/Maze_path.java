public class Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(maze(0, 0, 2, 2));
		//print(0, 0, 2, 2, "");
		ArrayList<String> res = new ArrayList<String>();
		best(0, 0, 2, 2, "", res);
		System.out.println(res);

	}

	private static void best(int i, int j, int k, int l, String ans, ArrayList<String> res) {
		if (i == k && j == l) {
			res.add(ans);
			return;
		}
		if (i > l || j > l) {
			return;
		}

		best(i + 1, j, k, l, "V" + ans, res);
		best(i, j + 1, k, l, "H" + ans, res);

	}

	private static void print(int i, int j, int k, int l, String ans) {
		// TODO Auto-generated method stub

		if (j > l || i > k) {

			return;

		}
		if (j == i && i == k) {
			System.out.println(ans);
			return;
		}

		print(i, j + 1, k, l, ans + "H");
		print(i + 1, j, k, l, ans + "V");

	}

	public static ArrayList<String> maze(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add(" ");
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();

		// horizontal
		if (cc + 1 <= ec) {
			ArrayList<String> rrh = maze(cr, cc + 1, er, ec);

			// self work
			for (String val : rrh) {
				mr.add("H" + val);

			}
		}
		// vertical

		if (cr + 1 <= er) {
			ArrayList<String> rrv = maze(cr + 1, cc, er, ec);
			for (String val : rrv) {

				mr.add("V" + val);

			}

		}

		return mr;
	}

}
