package Recurion;

import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
	

		int[] arrr = { 2, 3, 5, 6 };

	int	n = 10;

		//coinchangeper(n, arrr, "");
		coinchangecom(n, arrr, "", 0);

	}

	private static void coinchangecom(int n, int[] arr, String ans, int vidx) {
		if (n <= 0) {
			if (n == 0) {
				// System.out.println("dbdjhhabdjhbajd");
				System.out.println(ans);
			}
			return;
		}

		for (int i = vidx; i < arr.length; i++) {
			coinchangecom(n - arr[i], arr, ans + arr[i], i);
		}

	}
