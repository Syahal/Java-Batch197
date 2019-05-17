package day07;

public class Honda extends Bike {

	void run() {
		System.out.println("Hello Honda");
	}

	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
	}
}
