package Collection;

import java.util.HashMap;
import java.util.Map;

public class ExampleOfHashMap {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("FirstName", "Pavan");
		hm.put("FirstName", "Pav");

		hm.put("LastName", "Kumar");
		hm.put("Number", "9903456");
		hm.put("Gender", "male");
		
//		Set<String> keys =  hm.keySet();
//		for(String key : keys) {
//			System.out.println(key+" "+hm.get(key));
//		}
		
//		for(Map.Entry m: hm.entrySet()) {
//			System.out.println(m.getKey()+" "+m.getValue());
//			
//		}
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
	}

}
