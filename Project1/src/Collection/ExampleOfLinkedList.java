package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ExampleOfLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.add(400);
		ll.add(500);
		ll.add(600);
		ll.add(700);
		ll.add(800);
		ll.add(900);
		//System.out.println(ll);//[100, 200, 300, 400, 500, 600, 700, 800, 900]
		
		//ll.addFirst(220);//[220, 100, 200, 300, 400, 500, 600, 700, 800, 900]
		
		//ll.addLast(550); //[100, 200, 300, 400, 500, 600, 700, 800, 900, 550]
		
//		System.out.println(ll.getFirst()); //100
//		
//		System.out.println(ll.getLast()); //900
		
		
		//System.out.println(ll.peek());//this methods retrives bbut not removes the head of the list
		
		
//		System.out.println(ll.peekFirst());//100
//		System.out.println(ll.peekLast());//900
		
//	System.out.println(ll.poll());// this methods retrives and removes the head of the list
		//System.out.println(ll.pop());//similar that of poll
		
	
		Iterator i=ll.descendingIterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next()); // it gives the descending orderof list  
        }  
        
		System.out.println(ll);
	}

}
