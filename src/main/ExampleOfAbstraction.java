package main;



abstract class Bike{
	abstract void cost();
	void mileage() {
		System.out.println("goood mileage");
	}
}

 class Honda extends Bike{
	void cost() {
		System.out.println("the cost of honda is 1000000rs");
	}
}

public class ExampleOfAbstraction {

	public static void main(String[] args) {
		
	Honda h = new Honda();
	h.cost();
	h.mileage();
		
	}

}
