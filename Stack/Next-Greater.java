package Stackk;

public class DSClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack obj = new DynamicStack();

		obj.push(11);
		obj.push(12);
		obj.push(13);
		obj.push(14);
		obj.push(15);

		obj.push(16);
		obj.push(17);


		// int[] arr = { 2, 8, 3, 2, 1, 10, 13 };
		// int[] arr = { 10,9,8,7,6,5};
		int[] arr = { 18, 3, 2, 10, 13, 5 };

		nextgreater(new DynamicStack(), arr);

		System.out.println("--------------");

		nextgreaterorder(new DynamicStack(), arr);

	}

	private static void nextgreaterorder(DynamicStack ds, int[] arr) throws Exception {
		ds.push(0);
		int[] res = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			while (!ds.isEmpty() && arr[i] > arr[ds.peak()]) {
				res[ds.pop()] = arr[i];
			}
			ds.push(i);
		}

		while (!ds.isEmpty()) {
			res[ds.pop()] = -1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " -> " + res[i]);
		}

	}

	private static void nextgreater(DynamicStack ds, int[] arr) throws Exception {
		ds.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			while (!ds.isEmpty() && arr[i] > ds.peak()) {
				System.out.println(ds.pop() + " -> " + arr[i]);

			}
			ds.push(arr[i]);
		}
		while (!ds.isEmpty()) {
			System.out.println(ds.pop() + " -> -1");

		}

	}
