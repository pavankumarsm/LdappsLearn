package main;



class Plane{
	void takeOff() {
		System.out.println("Plane is takeoff");
	}
	void flying() {
		System.out.println("Plane is Flying");
	}
	void  landing() {
		System.out.println("palne is landing");
	}
}
	class CargoPlane extends Plane{
		void takeOff() {
			System.out.println("CargoPlane is takeoff");
		}
		//overridden methods
		void flying() {
			System.out.println("CargoPlane is flying in low height");
		}
		void landing() {
			System.out.println("CargoPlane is landing");
		}
		//specialized Method
		void CarryCargo() {
			System.out.println("CargoPlane is carrying Cargo");
		}
	}

	class FighterPlane extends Plane{
		
		//overridden methods
		void flying() {
			System.out.println("FighterPlane is flying in high height");
		}
		//specialized Method 
		void CarryWeapons() {
			System.out.println("FighterPlane is carrying Weapons");
		}
	}
	
public class Inheritance{
	
	public static void main(String[] args) {
		
		CargoPlane cp = new CargoPlane();
		FighterPlane fp = new FighterPlane();
		cp.takeOff();
		cp.flying();
		cp.landing();
		cp.CarryCargo();
		fp.takeOff();
		fp.flying();
		fp.landing();
		fp.CarryWeapons();


	}

	}
