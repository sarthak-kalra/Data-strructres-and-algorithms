public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abba";
		StringBuilder sb = new StringBuilder();

		palindrome(str, "", sb);
		System.out.println(sb);
		if (sb.toString().contentEquals(str)) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}

	private static void palindrome(String str, String ans, StringBuilder sb) {
		if (str.length() == 0) {
			System.out.println(ans);
			sb.append(ans);
			return;
		}
		palindrome(str.substring(1), str.charAt(0) + ans, sb);

	}

}
