public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    // Get ss array -- uses backtracking
		ArrayList<ArrayList<Integer>> bl = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] arr = { 1, 1, 2 };

		// gtessarr(arr, bl, list, 0);

		// System.out.println(bl);

		// get ss with duplicates

		getssdup(arr, bl, list, 0, true);
		System.out.println(bl);

	}

	private static void getssdup(int[] arr, ArrayList<ArrayList<Integer>> bl, ArrayList<Integer> list, int vidx,
			boolean flag) {

		if (vidx == arr.length) {
			ArrayList<Integer> br = new ArrayList<Integer>(list);
			bl.add(br);
			return;
		}
		if (flag == false && arr[vidx] == arr[vidx - 1]) {
			getssdup(arr, bl, list, vidx + 1, false);
		} else {
			list.add(arr[vidx]);
			getssdup(arr, bl, list, vidx + 1, true);
			list.remove(list.get(list.size() - 1));
			getssdup(arr, bl, list, vidx + 1, false);
		}

	}

	private static void gtessarr(int[] arr, ArrayList<ArrayList<Integer>> bl, ArrayList<Integer> list, int vidx) {
		// TODO Auto-generated method stub
		if (vidx == arr.length) {
			ArrayList<Integer> br = new ArrayList<Integer>(list);
			bl.add(br);
			return;
		}
		list.add(arr[vidx]);
		gtessarr(arr, bl, list, vidx + 1);
		list.remove(list.get(list.size() - 1));

		gtessarr(arr, bl, list, vidx + 1);

	}
