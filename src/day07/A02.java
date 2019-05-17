package day07;

public class A02 implements Printable01 {
	
	@Override
	public void print() {
		System.out.println("Print is called from Class A02");
	}
	//main method
	public static void main(String[] args) {
		
		A02 a = new A02();
		a.print();
	}

}
