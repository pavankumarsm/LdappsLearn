package Collection;

import java.util.TreeSet;

public class ExampleOfTreeSet {

	public static void main(String[] args) {
		
		TreeSet set =new TreeSet();
		set.add(120);
		set.add(60);
		set.add(160);
		set.add(30);
		set.add(80);
		set.add(140);
		set.add(180);
		System.out.println(set);//[30, 60, 80, 120, 140, 160, 180]
		
//		System.out.println(set.pollFirst());//it gives the 1st value
//		System.out.println(set.pollLast());//it gives the last value
//		System.out.println(set.floor(50));//30 //if the value is present it give but not present give the before
													//the value is given
//System.out.println(set.ceiling(100));//120//if the value is present it gives value otherwise it gives next greater value
	
//		System.out.println(set.lower(60));//30//the value is present but didn't give that value it give befor value
//		System.out.println(set.higher(140));//160// the value is present but didn't giev that value it gives after that value
//	
		
//		System.out.println(set.tailSet(120));//[120, 140, 160, 180]
//		System.out.println(set.headSet(120));//[30, 60, 80]
		
	
		
		
	}

}
