package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class ExampleOfHashSet {

	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add("A");
        hs.add("B");
        hs.add("Z");
		System.out.println(hs);
		
		HashSet set = new HashSet();
		set.add("pavan");
		set.add("java");
		
	//	set.addAll(hs);//[A, 50, B, java, 20, 40, pavan, 10, Z, 30]
		hs.removeAll(set); //[A, 50, B, 20, 40, 10, Z, 30]
		System.out.println(set);
		
		
//		 Iterator itr=hs.iterator();  
//		  while(itr.hasNext()){  
//		   System.out.println(itr.next());  
//		  }  
	}

}
