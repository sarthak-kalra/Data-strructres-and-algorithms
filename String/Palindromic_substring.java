public class Palindrome_substtring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "baab";
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String str1 = str.substring(i, j);
				int ans = palindrome(str1);
				if (ans == 1) {
					System.out.println(str1);

				}
			}
		}

	}

	public static int palindrome(String str1) {
		StringBuilder sb = new StringBuilder(str1);
		sb.reverse();
		String str2 = sb.toString();
		if (str1.contentEquals(str2)) {
			return 1;
		}
		return 0;
	}
}
