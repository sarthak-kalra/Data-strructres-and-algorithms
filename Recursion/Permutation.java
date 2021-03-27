package Recurion;

import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		printper("abc", "");

	}

	private static void printper(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i) ;
		    String str1 = str.substring(0, i) + str.substring(i + 1);

			printper(str1, ans+ch);
		//	System.out.println(str+"---");
		}

	}
