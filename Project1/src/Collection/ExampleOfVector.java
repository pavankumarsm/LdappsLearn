package Collection;

import java.util.Vector;

public class ExampleOfVector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("Banana");
		v.add("Mango");
		v.add("Jackfruit");
		v.add("Blackberry");
		v.add("Blueberry");
		
		System.out.println(v);
		v.addElement("kivi");
		v.addElement("WaterMelon");
		System.out.println(v);
	}

}
