import java.util.ArrayList;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "12";
		System.out.println(str.length());
		// print(str,"");

		ArrayList<String> list = new ArrayList<String>();
		// list = get(str);
		list = find(str);
		System.out.println(list);
	}

	private static ArrayList<String> get(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		str = str.substring(1);
		String res = getCode(ch);

		ArrayList<String> ans = new ArrayList<String>();
		ArrayList<String> list = get(str);

		for (int i = 0; i < res.length(); i++) {
			for (String val : list) {
				ans.add(res.charAt(i) + val);
			}
		}

		return ans;
	}

	private static void print(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String index = getCode(ch);
		str = str.substring(1);
		for (int i = 0; i < index.length(); i++) {

			print(str, ans + index.charAt(i));

			// TODO Auto-generated method stub
		}

	}

	public static String getCode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}
