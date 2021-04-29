package Queue;

import java.util.Queue;

public class DQ_Client {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

		Dynamic_queue dq = new Dynamic_queue();
		dq.enque(11);

		dq.enque(12);
		dq.enque(13);
		dq.enque(14);
		dq.enque(15);
		dq.enque(16);
		dq.display();
	

		// int[] arr = { 2, -3, 5, 6, -2, -9, -4, 10, 15 };
		// int k = 4;

		/// int arr[] = { -8, 2, 3, -6, 10 };
		// int k = 2;

		int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int k = 3;

		firstnegative(new Dynamic_queue(), arr, k);
		System.out.println("-----------");
    //PUTTING INDEXES IN QUEUE INSTEAD OF ACTUAL VALUES
		firstnegativeindex(new Dynamic_queue(), arr, k);

	}
	
	

	private static void firstnegativeindex(Dynamic_queue dq, int[] arr, int k) throws Exception {
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {

				dq.enque(i);

			}

		}
		if (dq.isEmpty()) {
			System.out.println(0);
		} else {

			System.out.println(arr[dq.getFront()]);
		}
		// System.out.println("---");
		// dq.display();
		// System.out.println("----");

		for (int i = 1; i <= arr.length - k; i++) {
			// removing
			while (!dq.isEmpty()&&dq.getFront() < i) {
				dq.deque();
			}
			// adding
			if (arr[i + k - 1] < 0) {
				dq.enque(i + k - 1);
			}
			// printing answer
			if (dq.isEmpty()) {
				System.out.println(0 + " ans ");
				// dq.enque(0);
			} else {
				System.out.println(arr[dq.getFront()] + " ans ");
			}
		}
		// System.out.println("-----");
		// dq.display();
	}

	private static void firstnegative(Dynamic_queue dq, int[] arr, int k) throws Exception {
		for (int i = 0; i < k; i++) {
			if (arr[i] < 0) {

				dq.enque(arr[i]);

			}

		}
		if (dq.isEmpty()) {
			// System.out.println(0);
			dq.enque(0);
		}

		System.out.println(dq.getFront());

		// System.out.println("---");
		// dq.display();
		// System.out.println("----");

		for (int i = 0; i < arr.length - k; i++) {
			// removing
			if (!dq.isEmpty()&&dq.getFront() == arr[i]) {
				dq.deque();
			}
			// adding
			if (arr[i + k] < 0) {
				dq.enque(arr[i + k]);
			}

			if (dq.isEmpty()) {
				// System.out.println(0 + " ans ");
				dq.enque(0);
			}
			// printing answer

			System.out.println(dq.getFront() + " ans ");

		}
		// System.out.println("-----");
		// dq.display();

	}


}
