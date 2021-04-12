package Stackk;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {
		if (isFull()) {
			int[] da = new int[2 * data.length];
			int i = tos;
			int count = 0;
			while (i >= 0) {
				da[i] = data[i];
				i--;
			}
			data = da;
		}
		super.push(item);
	}

}
