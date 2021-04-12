package Stackk;

public class Stack {

	protected int[] data;
	protected int tos;

	public Stack() {

		this.data = new int[5];
		this.tos = -1;
	}

	public Stack(int cap) {
		this.data = new int[cap];
		this.tos = -1;
	}

	public void push(int item) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is full");
		}
		tos++;
		data[tos] = item;
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int val = data[tos];
		data[tos] = 0;
		tos--;
		return val;
	}

	public int peak() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty");
		}
		int val = data[tos];
		return val;

	}

	public int size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (size() == data.length) {
			return true;
		} else {
			return false;
		}
	}

	public void display() {
		int i = tos;
		while (i >= 0) {
			System.out.print(data[i] + " ");
			i--;
		}
		System.out.println();
	}

}
