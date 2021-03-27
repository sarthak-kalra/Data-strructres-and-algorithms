package Recurion;

import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println(val);

		// TOH
	int	n = 3;
		String src = "S";
		String dest = "D";
		String help = "H";

		Toi(n, src, dest, help);

	}

	private static void Toi(int n, String src, String dest, String help) {
		if (n == 0) {
			return;
		}
		Toi(n - 1, src, help, dest);
		System.out.println(n + " from " + src + " to " + dest);
		Toi(n - 1, help, src, dest);

	}
