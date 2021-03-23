public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		// FIBONACCI--
		// int ans = fib(n);
		// System.out.println(ans);

		
	}


	private static int fib(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);

	}

}
