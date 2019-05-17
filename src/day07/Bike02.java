package day07;

public abstract class Bike02 {

	Bike02() {
		System.out.println("Bike is Created");
	}
	
	abstract void run();
	
	void changeGear() {
		System.out.println("Gear Changed");
	}
}
