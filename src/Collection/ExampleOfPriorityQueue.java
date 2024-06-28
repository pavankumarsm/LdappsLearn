package Collection;

import java.util.PriorityQueue;

public class ExampleOfPriorityQueue {

	public static void main(String[] args) {
		
		PriorityQueue Pq = new PriorityQueue();
		Pq.add(120);
		Pq.add(60);
		Pq.add(160);
		Pq.add(30);
		Pq.add(80);
		Pq.add(140);
		Pq.add(180);
		Pq.add(200);
		System.out.println(Pq);
//		System.out.println(Pq.poll());//30
//		System.out.println(Pq);//[60, 80, 140, 120, 200, 160, 180]
		
//		System.out.println(Pq.peek());//30
//		System.out.println(Pq);//[30, 60, 140, 120, 80, 160, 180, 200]
		
		System.out.println(Pq.offer(25));
		System.out.println(Pq);//[25, 30, 140, 60, 80, 160, 180, 200, 120]
	}

}
