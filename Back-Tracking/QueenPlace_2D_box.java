package BackTracking;

public class Queenplace_2dbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queenplacebox2d(new boolean[2][2], 0, 0, 0, 2, "");

	}

	private static void queenplacebox2d(boolean[][] bs, int row, int col, int qtn, int tq, String ans) {
		if (qtn == tq) {
			System.out.println(ans);
			return;
		}
		if (col == bs[0].length) {
			row = row + 1;
			col = 0;
		}
		if (row == bs.length) {
			return;
		}
		if(bs[row][col]==true) {
			return;
		}
		//YES
		bs[row][col]=true;
		queenplacebox2d(bs,row,col+1,qtn+1,tq,ans+"b{"+row+" "+col+"}");
		bs[row][col]=false;
		
		queenplacebox2d(bs,row,col+1,qtn,tq,ans);
		
		
	}

}
