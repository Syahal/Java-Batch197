package day01;

public class Testing1 {

	public static void main(String[] args) {
		
		int n = 9;
		
		for (int b = 0; b < n; b++) {
			for (int k = 0; k < n; k++) {
				if(b == k) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
		
	}

}
