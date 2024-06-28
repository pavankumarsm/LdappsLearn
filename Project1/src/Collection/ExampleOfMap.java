package Collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleOfMap {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		
		map.put(101, "Amit");
		map.put(102, "Roy");
		map.put(103, "java");
		
		System.out.println(map);
//		for(Map.Entry m : map.entrySet() ){
//			System.out.println(m.getKey()+" "+ m.getValue());
//		}
		
		Set<Entry<Integer,String>> entryset = map.entrySet();
		for(Entry<Integer,String> entry:entryset) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
	}

}
