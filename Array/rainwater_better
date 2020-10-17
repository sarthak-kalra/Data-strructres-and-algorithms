public class Rain_Trappingbest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] h = { 7, 1, 4, 0, 3, 8, 6, 3, 5 };

		int l = 0;
		int r = h.length-1;
		int leftmax = 0;
		int rightmax = 0;
		int ans = 0;
		while (l < r) {
			//System.out.println(l+" l ki val ");
			//System.out.println(r+" r ki val ");
			if (h[l] < h[r]) {
				if (h[l] >= leftmax) {
					leftmax = h[l];
				} else {
					ans = ans + leftmax - h[l];
				}

				l++;

			} else {

				if (h[r] >= rightmax) {
					rightmax = h[r];
				} else {
					ans = ans + rightmax - h[r];
				}

				r--;

			}

		}

		System.out.println(ans);
	}

}
