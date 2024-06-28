package Collection;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


//EnumSet
//enum days {  
//	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
//	}  
//
//public class ExampleOfEnum {
//
//	public static void main(String[] args) {
//		
//		Set<days> set =EnumSet.of(days.MONDAY,days.FRIDAY);// 
//		Set<days> set1 =EnumSet.allOf(days.class);
//		Iterator<days> iter = set1.iterator();
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//	}
//
//}

//EnumMap 
enum Days{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	
}
public class ExampleOfEnum {

	public static void main(String[] args) {
		
		EnumMap<Days,String> map = new EnumMap<Days,String>(Days.class);
		map.put(Days.MONDAY, "1");
		map.put(Days.TUESDAY,"2");
		map.put(Days.WEDNESDAY,"3" );
		map.put(Days.THURSDAY,"4" );
		
		  for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }  
	}

}

