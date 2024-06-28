package Collection;

import java.util.LinkedHashSet;

public class ExampleOfLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet set = new LinkedHashSet();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add("java");
		set.add(400);
		set.add(200);
		set.add(600);
		System.out.println(set);
		
	}

}
