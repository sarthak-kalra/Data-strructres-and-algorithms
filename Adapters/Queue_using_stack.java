package Queue;

import Stackk.DynamicStack;

public class Queue_using_stack_enque_eff {

	Dynamic_Stack ds = new Dynamic_Stack();

	public void enque(int item) throws Exception {
		ds.push(item);
	}

	public int deque() throws Exception {
		if (ds.isEmpty()) {
			throw new Exception("queue is empty");
		}
		DynamicStack helper = new DynamicStack();
		while (ds.size() != 1) {
			helper.push(ds.pop());
		}
		int ans = ds.pop();
		while (!helper.isEmpty()) {
			ds.push(helper.pop());
		}
		return ans;
	}

	public int peak() throws Exception {
		if (ds.isEmpty()) {
			throw new Exception("queue is empty");
		}
		DynamicStack helper = new DynamicStack();
		while (ds.size() != 1) {
			helper.push(ds.pop());
		}
		int ans = ds.pop();
		helper.push(ans);
		while (!helper.isEmpty()) {
			ds.push(helper.pop());
		}
		return ans;
	}

	public int size() {
		return ds.size();
	}

	public boolean isFull() {
		return ds.isFull();
	}

	public boolean isEmpty() {
		return ds.isEmpty();
	}

	public void display() throws Exception {
		displayy(ds);
		System.out.println();
	}

	private void displayy(DynamicStack ds) throws Exception {
		if (ds.isEmpty()) {
			return;
		}
		int val = ds.pop();
		displayy(ds);
		ds.push(val);
		System.out.print(val + " ");

	}

}
