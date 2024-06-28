package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleOfArrayList {

	public static void main(String[] args) {
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList list = new ArrayList();
		list.add("kumar");
		list.add("Ldapp");
		list.add("Puneeth");
		list.add(100);
		list.add(10);
		list.add(50);
		list.add("mango");
		System.out.println(list);
		
		ArrayList al = new ArrayList();
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		System.out.println(al);
		list.addAll(al);  //[kumar, Ldapp, Puneeth, 100, 10, 50, mango, 200, 300, 400, 500]
		//list.addAll(2,al);  //[kumar, Ldapp, 200, 300, 400, 500, Puneeth, 100, 10, 50, mango]
		
		//System.out.println(list);
		
//		System.out.println(list.get(3));//300
//		System.out.println(list.indexOf(400));//4
		
		list.add(100);
		//System.out.println(list.lastIndexOf(100));//11
		//System.out.println(list.subList(0, 5));//[kumar, Ldapp, 200, 300, 400]
		//list.remove(3);// remove the value of 3 index value
	//	System.out.println(list);
		
//		list.removeAll(al);
//		System.out.println(list);//[kumar, Ldapp, Puneeth, 100, 10, 50, mango, 100]
		
		//list.clear();//[]
		
		//list.set(2, 99);// it index 2 value replace by 99 and array cannot be shrink
		System.out.println(list);
		
		
		
		
		
		
		
		
//		Iterator li = list.iterator();
//		while(li.hasNext()) {
//			System.out.println(li.next());//printing value one by one
//		}
	}

}
