package Queue;

public class queue {

	protected int front;
	protected int size;
	protected int[] data;

	public queue() {
		this.front = 0;
		this.size = 0;
		this.data = new int[5];
	}

	public queue(int cap) {
		this.front = 0;
		this.size = 0;
		this.data = new int[cap];
	}

	public void enque(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Queue is full");
		}
		int idx = (front + size) % data.length;
		data[idx] = item;
		size++;
	}

	public int deque() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int idx = front % data.length;
		int val = data[idx];
		data[idx] = 0;
		front++;
	   
		size--;
		return val;
	}

	public int getFront() {
		int val = data[front];
		return val;

	}

	public int getsize() {
		return size;
	}

	public boolean isEmpty() {
		if (getsize() == 0) {
			return true;
		} else {
			return false;
		}

	}

	public boolean isFull() {
		if (getsize() == data.length) {
			return true;
		} else {
			return false;
		}

	}

	public void display() {
	
		for (int i = 0; i < size; i++) {
			
			int idx = (front+i) % data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println();
	}
}
