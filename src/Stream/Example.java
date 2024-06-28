
package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<String> l2 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
		List<Integer> l3 = Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15);

		List<Integer> li = new ArrayList<Integer>();
		li.addAll(l1);
		li.addAll(l3);

		List<Integer> s = List.of(0, 1, 2, 4, 5, 6, 7, 8, 9, 10);

		Map<Integer, String> list = s.stream().collect(Collectors.toMap(li::get, l2::get));

		System.out.println(list);

		Map<Integer, String> result = l1.stream().collect(Collectors.toMap(p -> p, p -> l2.get(p - 1)));
		System.out.println(result);

        List<String> stringList = new ArrayList<String>();

        stringList.add("One flew over the cuckoo's nest");
        stringList.add("To kill a muckingbird");
        stringList.add("Gone with the wind");

        Stream<String> stream1 = stringList.stream();

        List<String> stringList2 = new ArrayList<>();
        stringList2.add("Lord of the Rings");
        stringList2.add("Planet of the Rats");
        stringList2.add("Phantom Menace");

        Stream<String> stream2 = stringList2.stream();

        Stream<String> concatStream = Stream.concat(stream1, stream2);
        	
      
        List<String> stringsAsUppercaseList = concatStream
                .collect(Collectors.toList());

        System.out.println(stringsAsUppercaseList);
//        
//       
//        		Stream.of("a1","b2","c3","d4")
//        		.map((user) ->{
//        			System.out.println("map:"+user);
//        			return user.toUpperCase();
//        		})
//        		 .anyMatch(user -> {
//        		        System.out.println("anyMatch: " + user);
//        		        return user.startsWith("A");
//        		    });
//        		
//        		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
		Stream<Integer> stream = list1.stream();

		

		stream.forEach(n -> System.out.println(n));
		

	}

}
