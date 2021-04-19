package Stackk;

public class DSClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicStack obj = new DynamicStack();

		obj.push(11);
		obj.push(12);
		obj.push(13);
		obj.push(14);
		obj.push(15);

		obj.push(16);
		obj.push(17);
		obj.display();
		System.out.println("------");

		reversedisplay(obj);
		System.out.println();

		System.out.println("++++++++++");

		actualreverse(obj, new DynamicStack());

		obj.display();
		System.out.println("///");

	}

	private static void reversedisplay(DynamicStack ds) throws Exception {
		if (ds.isEmpty()) {
			return;
		}
		int val = ds.pop();
		reversedisplay(ds);
		ds.push(val);
		System.out.print(val + " ");
	}

	private static void actualreverse(DynamicStack ds, DynamicStack helper) throws Exception {
		if (ds.isEmpty()) {
			actualreverse2(ds, helper);
			return;
		}
		int val = ds.pop();
		helper.push(val);
		actualreverse(ds, helper);

	}

	private static void actualreverse2(DynamicStack ds, DynamicStack helper) throws Exception {

		if (helper.isEmpty()) {

			return;
		}
		int val1 = helper.pop();
		actualreverse2(ds, helper);
		ds.push(val1);
	}

}
