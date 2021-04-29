package Stackk;

public class Adapter_stack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_using_queue_push_eff s= new Stack_using_queue_push_eff();
		s.push(10);
		s.push(11);
		s.push(12);
		s.push(13);
		s.push(14);
		s.display();
		System.out.println("--");
		s.pop();
		s.pop();
		System.out.println("--");
		s.display();
		

	}

}
