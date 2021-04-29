package Queue;

public class Adapter_queue_client {

	public static void main(String[] args) throws Exception {
		Queue_using_stack_enque_eff dq = new Queue_using_stack_enque_eff();
		dq.enque(10);
		dq.enque(11);
		dq.enque(12);
		dq.enque(13);
		dq.enque(14);

		dq.display();

		dq.deque();
		dq.deque();

		dq.display();

		dq.enque(50);
		dq.enque(60);
		dq.enque(70);
		dq.enque(80);

		dq.display();

	}

}
