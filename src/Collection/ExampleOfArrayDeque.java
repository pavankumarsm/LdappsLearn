package Collection;

import java.util.ArrayDeque;

public class ExampleOfArrayDeque {

	public static void main(String[] args) {
		
		ArrayDeque dq = new ArrayDeque();
		dq.add(10);
		dq.add(20);
		dq.add(30);
		dq.add(40);
		dq.add(50);
		dq.add(60);
		System.out.println(dq);
		
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollFirst());
//		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());
		System.out.println(dq.pollLast());
		
	}

}
