import java.util.Scanner;


public class Equili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();
		while (tc > 0) {
			int n = scn.nextInt();

			int[] arr = new int[n];

			int sum = 0;
			for (int k = 0; k < arr.length; k++) {
				arr[k] = scn.nextInt();
				sum = sum + arr[k];
			}
			int suml = arr[0];
			// int sumr = sum-arr[0]-arr[1];
			int sumr = sum - arr[0];
			int count = 0;
			for (int k = 1; k < arr.length-1; k++) {

				sumr = sumr - arr[k];

				if (sumr == suml) {
					System.out.println(k);
					count= count+1;
					break;
				}

				suml = suml + arr[k];

			}
			if(count == 0 && arr.length!=1) {
				System.out.println(-1);
			}
			if(arr.length==1) {
				System.out.println("1");
			}

		}

	}

}
