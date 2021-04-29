// USES DEQUEU - DOUBLE ENDED

package Queue;

import java.util.Deque;
import java.util.LinkedList;


public class Sliding_window_maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		//int[] nums = {1,2,-9,-1,-10,6,-2,-9,8,1};
		
		//int[] nums = {1,3,1,2,0,5};
		int [] nums = {9,10,9,-7,-4,-8,2,-6};
		
			
		int k = 5;

		int[] res = maxSlidingWindow(nums, k);

		for (int val : res) {
			System.out.println(val + " ");
		}

	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		int[] res = new int[nums.length - k + 1];
		Deque<Integer> dq = new LinkedList<Integer>();
		// Queue<Integer> dq = new LinkedList<Integer>();
	
		for (int i = 0; i < k; i++) {
			
			while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
				
				//	System.out.println("hi");
					dq.removeLast();
				}

				// adding
				dq.add(i);
		}
		System.out.println(dq);

		res[0] = nums[dq.peek()];
		
		System.out.println(dq);
		System.out.println("---");

		for (int i = 1; i <= nums.length - k; i++) {
			
			// removing
			System.out.println(dq);
			System.out.println("*******");
			while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i + k - 1]) {
				
			//	System.out.println("hi");
				dq.removeLast();
			}
System.out.println(dq);
System.out.println("+++");
			// adding
			dq.add(i+k-1);
			
			System.out.println(dq);

			while (dq.peekFirst() < i) {
				dq.remove();
			}

			res[i] = nums[dq.getFirst()];

		}
		return res;

	}

}
