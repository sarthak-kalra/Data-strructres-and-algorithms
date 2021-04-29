package Queue;

import java.util.Queue;

public class DQ_Client {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		

		Dynamic_queue dq = new Dynamic_queue();
		dq.enque(11);

		dq.enque(12);
		dq.enque(13);
		dq.enque(14);
		dq.enque(15);
		dq.enque(16);
		dq.display();

		Dynamic_queue helper = new Dynamic_queue();

		System.out.println("-------------");
		reversedisplay(dq, 0);
		System.out.println();
		System.out.println("-----------");
		dq.display();

		System.out.println(" actual reverse");
		actualreverse(dq);

		System.out.println();
		System.out.println("-------");
		dq.display();

		System.out.println("******************");

		

	}
	
	



	private static void actualreverse(Dynamic_queue dq) throws Exception {
		// TODO Auto-generated method stub
		if (dq.isEmpty()) {
			return;
		}
		int val = dq.deque();

		actualreverse(dq);
		System.out.print(val + " ");
		dq.enque(val);

	}



}
