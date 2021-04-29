package Stackk;

import Queue.Dynamic_queue;

public class Stack_using_queue_push_eff {

	Dynamic_queue dq = new Dynamic_queue();

	public void push(int item) throws Exception {
		dq.enque(item);
	}

	public int pop() throws Exception {
		Dynamic_queue helper = new Dynamic_queue();
		if (dq.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		while (dq.getsize() != 1) {
			int val = dq.deque();
			helper.enque(val);
		}
		int ans = dq.deque();
		dq = helper;

		return ans;

	}

	public int peak() throws Exception {
		Dynamic_queue helper = new Dynamic_queue();
		if (dq.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		while (dq.getsize() != 1) {
			int val = dq.deque();
			helper.enque(val);
		}
		int ans = dq.deque();
		helper.enque(ans);
		dq = helper;

		return ans;

	}

	public int size() {
		return dq.getsize();
	}

	public boolean isEmpty() {
		return dq.isEmpty();
	}

	public boolean isFull() {
		return dq.isFull();
	}
//ABSTRACTION
	public void display() throws Exception {
		displayy(0);
		System.out.println();
	}

	private void displayy(int count) throws Exception {
		if (count == dq.getsize()) {
			return;
		}
		int val = dq.deque();
		dq.enque(val);
		displayy(count + 1);
		System.out.print(val+" ");

	}

}
