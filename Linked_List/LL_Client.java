package Linked_List;

public class LL_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		java.util.LinkedList<Integer> list = new java.util.LinkedList<Integer>();
		ll.AddLast(10);
		ll.AddLast(20);
		ll.AddLast(30);
		ll.AddLast(40);
		ll.AddLast(50);

		ll.display();

		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());

		System.out.println("-----");
		System.out.println(ll.getAt(1));
		// throws index out of bounds -> System.out.println(ll.getAt(5));
		System.out.println(ll.getAt(4));

		System.out.println("-----");
		ll.AddFirst(1000);
		ll.AddLast(2000);
		ll.AddAt(6, 5000);
		ll.display();

		System.out.println(ll.getsize());
		System.out.println(ll.getAt(7));

		System.out.println(ll.RemoveLast());
		ll.display();

		System.out.println("---");

		System.out.println(ll.RemoveFirst());
		ll.display();
		System.out.println(ll.getsize());

		System.out.println(ll.RemoveAt(5));
		ll.display();

		// System.out.println(ll.RemoveAt(3));
		ll.display();
		System.out.println(ll.getsize());

		System.out.println("-------------");

		System.out.println("**************");
		ll.AddLast(60);
		ll.AddLast(70);
		ll.AddLast(80);
    
    	ll.display();

    


	}
	
	

}
