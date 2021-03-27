package Recurion;

import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// STAIRS

		n = 7;
		int m = 6;
		printstairs(n, m, "");
		System.out.println(count + "-");
		int val = getcount(n, m);
		System.out.println(val);

	}

	private static int getcount(int n, int m) {

		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		int count1 = 0;
		for (int i = 1; i <= m; i++) {
			count1 = count1 + getcount(n - i, m);
		}

		return count1;

	}
