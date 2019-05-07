package day01;

public class Testing04 {

	public static void main(String[] args) {
		
		int i = 9;
		int j = (i-1)/2; //titik tengah
		
		for (int x = 0; x < i; x++) {
			for (int y = 0; y < i; y++) {
				if (x + y == i-1 ||x == y || y == j || x == j) {
					System.out.println("*\t");
				} else {
					System.out.println("\t");
				}
			}
			System.out.println("\n");
		}
	}

}
