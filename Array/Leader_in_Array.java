import java.util.Scanner;

public class Leader_in {
	public static void main(String[] args) {
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

			int lead = arr[arr.length-1];
			for (int end = arr.length - 2; end >= 0; end--) {
				if (arr[end] >= lead) {
					System.out.print(lead + " ");
					lead = arr[end];
				}
				

			}
			System.out.println(lead);
			tc--;

		}

	}
}
