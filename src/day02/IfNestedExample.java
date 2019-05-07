package day02;

public class IfNestedExample {

	public static void main(String[] args) {
		
		//create two variables
		int age = 18;
		int weight = 60;
		
		//applying condition
		if (age >= 20) {
			if (weight > 50) {
				System.out.println("You're eligible to donate blood");
			} else {
				System.out.println("You're not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greather than 20");
		}
	}

}
