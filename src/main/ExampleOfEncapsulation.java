package main;


 class Customer{
	
	 private int Id;
	 private String name;
	 private long num;
	 
	 public void setData(int Id,String name, long num) {
		 this.Id =Id;
		 this.name = name;
		 this.num = num;
		 
	 }
	 public int getId() {
		 return Id;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 public long getNum() {
		 return num;
	 }
	 
	 
}
 
 
 
public class ExampleOfEncapsulation {

	public static void main(String[] args) {
		
		Customer c= new Customer();
		c.setData(1, "pavan", 990236);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getNum());
	}

}
