import java.util.Scanner;

public class Kadanes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while (tc > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i]= scn.nextInt();
			}
			
			int max = 0;
			int res = Integer.MIN_VALUE;
			int j =0;
			for(int i =0;i<arr.length;i++) {
				max = max +arr[i];
				
				if(max>res) {
					res = max;
				}
				if(max<0) {
					max = 0;
				}
				
			}
			System.out.println(res);

			tc--;
		}

	}

}
