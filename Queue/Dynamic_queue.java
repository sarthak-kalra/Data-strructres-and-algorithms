package Queue;

public class Dynamic_queue extends queue {

	public void enque(int item) throws Exception {
		if (isFull()) {
			int[] na = new int[2 * data.length];
			for (int i = 0; i <  size; i++) {

				int idx = (front+i )% data.length;
				na[i] = data[idx];
			}
			data = na;

		}
		super.enque(item);
	}

}
