package Linked_List;

public class LinkedList {

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}

		public Node() {

		}

	}

	private Node head;
	private Node tail;
	private int size;

	public int getsize() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public int getFirst() throws Exception {
		if (size == 0) {
			throw new Exception(" Linked List is empty");
		}

		return head.data;
	}

	public int getLast() throws Exception {
		if (size == 0) {
			throw new Exception(" Linked List is empty");
		}

		return tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (getsize() == 0) {
			throw new Exception(" Linked List is empty");
		}
		if (idx >= size || idx < 0) {
			throw new Exception(" Index out of bounds");
		}

		Node temp = head;
		int i = 0;
		while (i != idx) {
			temp = temp.next;
			i++;
		}
		return temp.data;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void AddLast(int item) {
		// NEW NODE
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// Attaching
		if (head == null) {
			head = tail = nn;
		} else {

			tail.next = nn;
			tail = tail.next;
		}
		size++;

	}

	public void AddFirst(int item) {
		// NEW NODE
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		// ATTACHING
		nn.next = head;

		// DATA MEMBERS
		if (isEmpty()) {
			head = tail = nn;
		} else {
			head = nn;
		}
		size++;
	}

	private Node getNode(int idx) throws Exception {

		if (idx >= size || idx < 0) {
			throw new Exception(" Index out of bounds");
		}

		Node temp = head;
		int i = 0;
		while (temp.next != null && i != idx) {
			temp = temp.next;
			i++;
		}
		return temp;

	}

	public void AddAt(int idx, int item) throws Exception {

		if (idx > size || idx < 0) {
			throw new Exception(" Index out of bounds");
		}
		if (idx == 0) {
			AddFirst(item);
		} else if (idx == getsize()) {
			AddLast(item);
		} else {
			// NEW NODE
			Node nn = new Node();
			nn.data = item;
			nn.next = null;

			// GETTING BEFORE AND AFTER NODES
			Node bn = getNode(idx - 1);
			Node an = getNode(idx);

			// ATTACHING
			bn.next = nn;
			nn.next = an;

			size++;

		}

	}

	public int RemoveLast() throws Exception {
		if (getsize() == 0) {
			throw new Exception("Linked List is empty");
		}
		Node ans = tail;
		if (getsize() == 1) {
			head = tail = null;
		} else {
			Node tm1 = getNode(getsize() - 2);
			tm1.next = null;
			tail = tm1;
		}
		size--;
		return ans.data;

	}

	public int RemoveFirst() throws Exception {
		if (getsize() == 0) {
			throw new Exception("Linked List i empty");
		}
		Node ans = head;
		if (getsize() == 1) {
			head = tail = null;
		} else {
			head = head.next;

		}
		size--;
		return ans.data;
	}

	public int RemoveAt(int idx) throws Exception {
		if (getsize() == 0) {
			throw new Exception(" Linked List is empty");
		}
		if (idx >= size || idx < 0) {
			throw new Exception(" Index out of bounds");
		}
		if (idx == 0) {
			int val = RemoveFirst();
			return val;

		} else if (idx == getsize() - 1) {
			int val = RemoveLast();
			return val;
		} else {
			Node nm1 = getNode(idx - 1);
			Node np1 = getNode(idx + 1);

			Node ans = nm1.next;

			nm1.next = np1;

			size--;

			return ans.data;
		}
	}
}
