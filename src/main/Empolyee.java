package main;


class Empolyees{
	int num;
	String name ;
	float salary;
	
	void insert(int i, String n, float j) {
		num=i;
		name = n;
		salary =j;
		
	}
	
	void result() {
		System.out.println(num+" "+name+" "+salary);
	}
}


public class Empolyee {
	

	public static void main(String[] args) {
		Empolyees e1 = new Empolyees(),e2 = new Empolyees(),e3 = new Empolyees();
	
		
		
		e1.insert(1,"pavan",450000000);
		e2.insert(2,"pavankumar",550000000);
		e3.insert(3,"pavanpk",650000000);
		
		
		e1.result();
		e2.result();
		e3.result();
		
	}

}
