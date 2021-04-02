package BackTracking;

public class Queenplace_box {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenplacebox(new boolean[4], 0, 0, 2, "");

	}

	private static void queenplacebox(boolean[] bs, int idx, int qtn, int tq, String string) {
		if (qtn == tq) {
			System.out.println(string);
			return;
		}
		if(idx>=bs.length) {
			return;
		}
		if (bs[idx] == true) {
			return;
		}
		bs[idx] = true;
		queenplacebox(bs, idx + 1, qtn + 1, tq, string + "b" + idx+" ");
		bs[idx]=false;
		
		queenplacebox(bs, idx + 1, qtn, tq, string);

	}

}
