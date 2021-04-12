package Stackk;

public class StackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		s.display();
		
		s.pop();
		
		s.display();

	}

}
