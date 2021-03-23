package Recurion;

public class Interweaving_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one = "algoexpert";
		String two = "your-dream-job";
		String three = "ayloguore-xdpreeratm-job";

		// one = "aaaaaaa";
		// two = "aaaabaaa";
		// three = "aaaaaaaaaaaaaab";

		
		  one = "aabcc"; two = "dbbca"; three = "aadbbbaccc";
		  
		  one = "aaa"; two = "aaaf"; three = "aaafaaa";
		  
		 
		 
		// one = "a";
		// two = "b";
		// three = "a";
	//	one = "aabcc";
		//two = "dbbca";
		//three = "aadbbcbcac";

		// check(one, two, three, "", 0);
		if (three.length() != one.length() + two.length()) {
			System.out.println(false);
		} else {
			boolean ans = get(one, two, three, 0, 0);
			System.out.println(ans);
			ans = areInterwoven(one, two, three, 0, 0);
			System.out.println(ans);

		}
	}

	private static boolean get(String one, String two, String three, int i, int j) {
		System.out.println(i + ":i" + j + ":j");
		int k = i + j;
		if (k == three.length()) {
			System.out.println("hii");
			return true;
		}

		if (i < one.length() && one.charAt(i) == three.charAt(k)) {
			
		boolean ans =  get(one, two, three, i + 1, j);
		System.out.println(ans);
		return ans;
		}
		if (j < two.length() && two.charAt(j) == three.charAt(k)) {
			System.out.println("hooooo");
			return get(one, two, three, i, j + 1);
		}

		return false;

	}

	private static void check(String one, String two, String three, String ans, int index) {
		// TODO Auto-generated method stub
		System.out.println(ans + ":ans ");
		if (three.equals(ans)) {
			System.out.println("yes");
			return;
		}
		if (index == three.length()) {
			return;
		}
		if (one.length() == 0) {
			check(one, "", three, ans + two, index + two.length());
			return;
		}
		if (two.length() == 0) {
			check("", two, three, ans + one, index + one.length());
			return;
		}

		System.out.println(one);
		if (one.charAt(0) == three.charAt(index) && two.charAt(0) != three.charAt(index)) {
			check(one.substring(1), two, three, ans + one.charAt(0), index + 1);
		} else if (one.charAt(0) != three.charAt(index) && two.charAt(0) == three.charAt(index)) {
			check(one, two.substring(1), three, ans + two.charAt(0), index + 1);

		} else if (one.charAt(0) == three.charAt(index) && two.charAt(0) == three.charAt(index)) {
			check(one.substring(1), two, three, ans + one.charAt(0), index + 1);
			check(one, two.substring(1), three, ans + two.charAt(0), index + 1);
		} else {
			System.out.println("false");
			return;
		}

	}

	public static boolean areInterwoven(String one, String two, String three, int i, int j) {
		System.out.println("-----------------");
		System.out.println(i + ":i, " + j + ":j");
		int k = i + j;
		if (k == three.length())
			return true;
		if (i < one.length() && one.charAt(i) == three.charAt(k)) {
			System.out.println("prev");
			boolean flag = areInterwoven(one, two, three, i + 1, j);
			System.out.println(flag);
			System.out.println(i + ": after i. " + j + ":after j");

			if (flag)

				return true;
		}

		if (j < two.length() && two.charAt(j) == three.charAt(k)) {

			System.out.println("hello");
			boolean ans = areInterwoven(one, two, three, i, j + 1);

			System.out.println(i + ": after after i. " + j + ":j");
			return ans;
		}
		System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiii6g,");
		return false;
	}

}
