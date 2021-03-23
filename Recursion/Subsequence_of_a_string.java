import java.util.ArrayList;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		// GET_SS STRING
		String str = "abc";
		printss(str, "");
		ArrayList<String> ans = new ArrayList<String>();
		ans = getss(str, ans);
		
		System.out.println(ans);
	}

	private static ArrayList<String> getss(String str, ArrayList<String> ans) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		ArrayList<String> mr = getss(str.substring(1), ans);
		ArrayList<String> rr = new ArrayList<String>();

		for (String val : mr) {
			rr.add(val);
			rr.add(ch + val);
		}

		return rr;

	}

	static int count = 0;

	private static void printss(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(++count + " " + ans);
			return;
		}
		printss(str.substring(1), ans + str.charAt(0));
		printss(str.substring(1), ans);

	}
