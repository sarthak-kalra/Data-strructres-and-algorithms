package Recurion;

import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {


		//printpar(0, 0, n, n, "");
		//ArrayList<String> res1 = new ArrayList<String>();

		//getpar(0, 0, 3, 3, "", res1);
		//System.out.println(res1);
		
		

	}

	private static void getpar(int i, int j, int open, int close, String ans, ArrayList<String> res1) {
		if (i == open && j == close) {
			System.out.println(ans);
			res1.add(ans);
			return;
		}
		if (j > i) {
			return;
		}
		if (i > open || j > close) {
			return;
		}
		printpar(i + 1, j, open, close, ans + "(");
		printpar(i, j + 1, open, close, ans + ")");

	}
