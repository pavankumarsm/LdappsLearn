package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleOfDeque {

	public static void main(String[] args) {
		
		Deque d = new ArrayDeque();
		d.add("MY");
		d.offer("name");
		d.add("is");
		
		System.out.println(d);
	}

}
