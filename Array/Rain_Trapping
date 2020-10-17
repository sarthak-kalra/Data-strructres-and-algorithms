public class rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 1, 4, 0, 3, 8, 6, 3, 5 };

		int[] lefthi = new int[arr.length];
		int[] righthi = new int[arr.length];
		int[] diff = new int[arr.length];

		int high = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (high <= arr[i]) {
				high = arr[i];
			}
			lefthi[i] = high;

		}
		int high1 = Integer.MIN_VALUE;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (high1 <= arr[i]) {
				high1 = arr[i];
			}
			righthi[i] = high1;

		}

		// for(int i =0;i<righthi.length;i++) {
		// System.out.print(righthi[i]+" ");
		// }

		for (int i = 0; i < arr.length; i++) {
			if (lefthi[i] < righthi[i]) {
				diff[i] = lefthi[i] - arr[i];
			} else {
				diff[i] = righthi[i] - arr[i];
			}
		}

		for (int i = 0; i < righthi.length; i++) {
			System.out.print(diff[i] + " ");
		}
		System.out.println();
		
		int sum =0;
		for (int i = 0; i < righthi.length; i++) {
			sum = sum +diff[i];
		}
		System.out.println(sum);
		

	}

}
