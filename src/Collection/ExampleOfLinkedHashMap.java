package Collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExampleOfLinkedHashMap {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> h = new LinkedHashMap<String,Integer>();
		h.put("india", 1000);
		h.put("usa", 700);
		h.put("uae", 300);
		h.put("russia", 600);
		h.put("Uk", 300);
		h.put("japan", 500);
		h.put("England", 700);
		System.out.println(h);
		
		for(Map.Entry<String, Integer> entry : h.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
