package Collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ExampleOfTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String,String> flights = new TreeMap<String,String>();
		flights.put("21:00", "Indigo");
		flights.put("23:30", "goAir");
		flights.put("04:30", "SpiceJet");
		flights.put("16:00", "Vistara");
		flights.put("21:30", "AirIndia");
		flights.put("09:00", "Indigo");
		flights.put("11:00", "SpiceJet");
		flights.put("13:00", "goAir");
		
//		Set<Entry<String,String>> entrys = flights.entrySet();
//		for(Entry<String,String> entry : entrys)
//		System.out.println(entry);
		
		//descending 
//		Map<String,String> m1 = flights.descendingMap();
//		Set<Entry<String,String>> entrys = m1.entrySet();
//		for(Entry<String,String> entry:entrys) {
//			System.out.println(entry);
//		}
		
//		HeadMap(tokey) the value will excluded
//		Map<String,String> m1 = flights.headMap("13:00"); //04:30=SpiceJet 09:00=Indigo 11:00=SpiceJet 
//		Set<Entry<String,String>> entrys = m1.entrySet();
//		for(Entry<String,String> entry:entrys) {
//			System.out.println(entry);
//		}
//		tailMap(fromKey)  the value be included
//		Map<String,String> m1 = flights.tailMap("13:00");//13:00=goAir 16:00=Vistara 21:00=Indigo 21:30=AirIndia 23:30=goAir 
//		Set<Entry<String,String>> entrys = m1.entrySet();
//		for(Entry<String,String> entry:entrys) {
//			System.out.println(entry);
//			
//		}
		
//		Map<String,String> m1 = flights.subMap("13:00","23:00",);
		Map<String,String> m1 = flights.subMap("13:00",true,"23:00",false);
		Set<Entry<String,String>> entrys = m1.entrySet();
		for(Entry<String,String> entry:entrys) {
			System.out.println(entry);
			
		}
		
	}

}
