package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
} 
public class ExampleOfStream {

	public static void main(String[] args) {
		
//		Collection<String> coll = Arrays.asList("apple","ball","cat","dog");
//		Stream<String> stream1 = coll.stream();
//		stream1.forEach(System.out::println);
//		
//		
//		Set<String> hm = new HashSet<>(coll);
//		Stream<String> stream2 = hm.stream();
//		stream2.forEach(System.out::println);
		
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Dell",25000f));
		productList.add(new Product(2,"HP",25000f));
		productList.add(new Product(3,"Asus",28000f));
		productList.add(new Product(4,"HPPavilion",65000f));
		productList.add(new Product(5,"HP",30000f));
		productList.add(new Product(6,"MacBook",85000f));
		productList.add(new Product(7,"MackAir",95000f));
		productList.add(new Product(8,"lenova",55000f));
		
		
		//list
		
		 List<Float> productPriceList2 =productList.stream()  
                 .filter(p -> p.price < 80000) 
                 .map(p->p.price)        
                 .collect(Collectors.toList()); 
		 		System.out.println(productPriceList2); 
		
		
		//count
		long count = productList.stream().count();
		System.out.println("number of the product is "+count);

	
		//map
		Map<Integer,String> productPrice = productList.stream()
				.collect(Collectors.toMap(p->p.id,p->p.name));
		System.out.println(productPrice);
		
		
		//set
		Set<Float> productPrice1 = productList.stream()
				.map(p->p.price)
				.collect(Collectors.toSet());//collect if it is set(remove the dublicates)
		System.out.println("dublicates are removed "+productPrice1);
//		
		
		//sum
		double totalPrice = productList.stream()
				.collect(Collectors.summingDouble(p->p.price));
		System.out.println("total sum of price "+totalPrice);
		 
		//reduce
		Float totalPrice2 = productList.stream()
				.map(p->p.price)
				.reduce(0.0f,(sum,price)->sum+price);
		
		System.out.println("total sum of price by reduce method "+totalPrice2);
		
		
		//skip and limit
		 List<Float> productPriceList3 =productList.stream()  
                  .skip(2)
                  .limit(3)
                 .map(p->p.price)        
                 .collect(Collectors.toList()); 
		 		System.out.println(productPriceList3); 
//		
		
		//skip and limit
//		Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
//		 		
//		List<Integer> result= evenNumInfiniteStream
//		 				.skip(5)
//		 				.limit(10)
//		 				.collect(Collectors.toList());
//		 	      
//		 System.out.println(result);
		
		
		//max
		Product productA = productList.stream()
				.max((product1,product2)->product1.price>product2.price?1:-1).get();
		
			System.out.println("max value of product  "+productA.price);
		//min
		Product productB = productList.stream()
					.min((product1,product2)->product1.price>product2.price?1:-1).get();
			
			System.out.println("min value of product  "+productB.price);
			
			
			//parallel method
//			Collection<String> coll = Arrays.asList("tiger","lion","leopard","tiger");
//			Stream<String> stream  = coll.stream().parallel();
//			stream.forEach(System.out::println);
//			
//			
//			List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//			List<String> l2 = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
//			List<Integer> l3 = Arrays.asList(8, 9, 10, 11, 12, 13, 14, 15);
//
//			List<Integer> li = new ArrayList<Integer>();
//			li.addAll(l1);
//			li.addAll(l3);
//
//			List<Integer> s = List.of(0, 1, 2, 4, 5, 6, 7, 8, 9, 10);
//
//			Map<Integer, String> list = s.stream().collect(Collectors.toMap(li::get, l2::get));
//
//			System.out.println(list);
//
//			Map<Integer, String> result = l1.stream().collect(Collectors.toMap(p -> p, p -> l2.get(p - 1)));
//			System.out.println(result);
//
			
//	        List<String> stringList = new ArrayList<String>();
//
//	        stringList.add("One flew over the cuckoo's nest");
//	        stringList.add("To kill a muckingbird");
//	        stringList.add("Gone with the wind");
//
//	        Stream<String> stream1 = stringList.stream();
//
//	        List<String> stringList2 = new ArrayList<>();
//	        stringList2.add("Lord of the Rings");
//	        stringList2.add("Planet of the Rats");
//	        stringList2.add("Phantom Menace");
//
//	        Stream<String> stream2 = stringList2.stream();
//
//	        Stream<String> concatStream = Stream.concat(stream1, stream2);
//	        	
//	      
//	        List<String> stringsAsUppercaseList = concatStream
//	                .collect(Collectors.toList());
//
//	        System.out.println(stringsAsUppercaseList);
//	        
//	       
//	        		Stream.of("a1","b2","c3","d4")
//	        		.map((user) ->{
//	        			System.out.println("map:"+user);
//	        			return user.toUpperCase();
//	        		})
//	        		 .anyMatch(user -> {
//	        		        System.out.println("anyMatch: " + user);
//	        		        return user.startsWith("A");
//	        		    });
//	        		
//	        		
//			List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
//			Stream<Integer> stream = list1.stream();
//
//			stream.forEach(n -> System.out.println(n));
//			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
	}
	
}
