package BackTracking;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		twoqueensper(new boolean[4], 0, 2, "");
		twoqueenscom(new boolean[4], 0, 2, "", 0);
	}

	private static void twoqueenscom(boolean[] bs, int qtn, int tq, String ans, int vidx) {
		if (qtn == tq) {
			System.out.println(++count + " " + ans);
			return;
		}
		for (int i = vidx; i < bs.length; i++) {
			if (bs[i] == false) {
				bs[i] = true;
				twoqueenscom(bs, qtn + 1, tq, ans + "q" + qtn + "b" + i + " ",i);
				bs[i] = false;
			}
		}

	}

	public static int count = 0;

	private static void twoqueensper(boolean[] bs, int qtn, int tq, String ans) {
		if (qtn == tq) {
			System.out.println(++count + " " + ans);
			return;
		}
		for (int i = 0; i < bs.length; i++) {
			if (bs[i] == false) {
				bs[i] = true;
				twoqueensper(bs, qtn + 1, tq, ans + "q" + qtn + "b" + i + " ");
				bs[i] = false;
			}
		}

	}
