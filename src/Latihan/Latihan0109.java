package Latihan;

public class Latihan0109 {

	public static void main(String[] args) {

		int n = 9;
		int b = n-1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i>=j && i+j <= b || i<=j && i+j >= b) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println(" ");
		}
	}

}
