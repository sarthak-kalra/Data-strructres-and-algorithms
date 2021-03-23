import java.util.Scanner;

public class Subarray_given_sum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int tc = scn.nextInt();

		while (tc > 0) {

			int n = scn.nextInt();
			int k = scn.nextInt();
			int count = 0;

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++) {

				arr[i] = scn.nextInt();

			}
			
				int f = arr.length;

				int i = 0;

				int sum = 0;
				for (int j = 0; j < f; j++) {
					sum = sum + arr[j];

					while (sum > k) {
						sum = sum - arr[i];
						i++;
					}
					if (sum == k) {
						System.out.println((i + 1) + " " + (j + 1));
						count = count + 1;
						break;
					}
				}
				if (count == 0) {
					System.out.println("-1");
				}

				tc--;
			}
		

	}
}
