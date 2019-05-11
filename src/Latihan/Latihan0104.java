package Latihan;

public class Latihan0104 {

	public static void main(String[] args) {

		int n = 9;
		int t = (n - 1) / 2; // nilai titik tengah

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1 || i == j || j == t || i == t) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println();
		}

	}

}
