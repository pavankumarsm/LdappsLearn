package main;

class Plane1{
	void takeOff() {
		System.out.println("Plane is takeoff");
	}
	void flying() {
		System.out.println("Plane is Flying");
	}
	void  landing() {
		System.out.println("plane is landing");
	}
}

class CargoPlane1 extends Plane1{
	void takeOff() {
		System.out.println("CargoPlane is takeoff");
	}
	
	void flying() {
		System.out.println("CargoPlane is flying in low height");
	}
	void landing() {
		System.out.println("CargoPlane is landing");
	}
		
	void CarryCargo() {
		System.out.println("CargoPlane is carrying Cargo");
	}
}

class FighterPlane1 extends Plane1{
	void flying() {
		System.out.println("FighterPlane is flying in high height");
	}
		
	void CarryWeapons() {
		System.out.println("FighterPlane is carrying Weapons");
	}
}

public class ExampleOfPolymorphism{
	
	public static void main(String[] args) {
		
		CargoPlane1 cp1 = new CargoPlane1();
		FighterPlane1 fp1 = new FighterPlane1();
		
		
		Plane1 ref;
		ref=cp1;
		ref.takeOff();
		ref.flying();
		ref.landing();
		
		//access the specialized method using downcasting 
		((CargoPlane1)ref).CarryCargo();
		
		
		ref=fp1;
		ref.takeOff();
		ref.flying();
		ref.landing();
		
		
		((FighterPlane1)ref).CarryWeapons();
	}

}