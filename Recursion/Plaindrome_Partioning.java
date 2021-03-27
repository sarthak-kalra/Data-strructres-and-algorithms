package Recurion;

import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> res = new ArrayList<String>();
		PalPartitioning("nitin", "", res);
		System.out.println(res);

	}

	private static void PalPartitioning(String str, String ans, ArrayList<String> res) {

		if (str.length() == 0) {
		//	System.out.println("hii");
			System.out.println(ans);
			res.add(ans);
			return;
		}
		for (int i = 1; i <= str.length(); i++) {
		
			String pal = str.substring(0, i);
		//	System.out.println(pal);
			String ros = str.substring(i);
		//	System.out.println(ros+":---");
			if (ispal(pal)) {
				PalPartitioning(ros, ans + pal + " ", res);
			}

		}

	}

	public static boolean ispal(String str) {
		String str1 = new String(str);
		StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		String one = sb.toString();
		if (one.equals(str)) {
			return true;
		} else {

			return false;
		}
	}
