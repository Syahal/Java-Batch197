package day07;

public class Yamaha01 extends Bike {

	void run() {
		System.out.println("Hello Yamaha");
	}
	
	public static void main(String[] args) {
		Bike b = new Yamaha01();
		b.run();
	}
}
