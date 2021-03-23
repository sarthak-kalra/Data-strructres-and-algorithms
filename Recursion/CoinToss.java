public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		
 // COINTOSS--
		cointoss(n, "");
		ArrayList<String> list = new ArrayList<String>();
		list = getcointoss(n, list);
		System.out.println(list);
	}

	private static ArrayList<String> getcointoss(int n, ArrayList<String> list) {
		if (n == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		ArrayList<String> mr = getcointoss(n - 1, list);
		ArrayList<String> rr = new ArrayList<String>();
		for (String val : mr) {
			rr.add("H" + val);
			rr.add("T" + val);
		}

		return rr;
	}

	private static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		cointoss(n - 1, ans + "H");
		cointoss(n - 1, ans + "T");
	}

	private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);

	}

}
