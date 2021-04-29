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

		

	}

	private static void reversedisplay(Dynamic_queue dq, int count) throws Exception {
		// dq.display();
		if (count == dq.size) {
			return;
		}
		int val = dq.deque();
		dq.enque(val);
		reversedisplay(dq, count + 1);
		System.out.print(val + " ");

	}

}
