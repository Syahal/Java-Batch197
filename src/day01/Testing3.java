package day01;

public class Testing3 {

	public static void main(String[] args) {
		
		int i = 9;
		
		for (int x = 0; x < i; x++) {
			for (int y = 0; y < i; y++) {
				if (x + y == i-1 || x == y) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}

}
