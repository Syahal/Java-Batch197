package day03;

import java.util.*;

public class Logic03Soal0107 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = Integer.parseInt(input.nextLine());

		// deklarasi Array
		int arr[][] = new int[n][n];

		// deklarasi variable deret angka1
		int[] deretAngka1 = new int[n];
		int nilaiAwal1 = 1;
		// mencari deret angka1 dengan looping
		for (int i = 0; i < deretAngka1.length; i++) {
			deretAngka1[i] = nilaiAwal1;
			nilaiAwal1 = nilaiAwal1 + (i + 2); // rumus deret angka (dihasilkan dengan melihat pola deret angka)
		}

		// deklarasi variable deret angka2
		int[] deretAngka2 = new int[n];
		int nilaiAwal2 = 2;
		// mencari deret angka2 dengan looping
		for (int j = 0; j < deretAngka2.length; j++) {
			deretAngka2[j] = nilaiAwal2;
			nilaiAwal2 = nilaiAwal2 + (2 * (j + 1)); // rumus deret angka (dihasilkan dengan melihat pola deret angka)
		}

		// menghitung diagonal dengan looping
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					arr[i][j] = deretAngka1[i];
				} else if (i + j == n - 1) {
					arr[i][j] = deretAngka2[j];
				} // rumus diagonal baris+kolom == jumlah array dikurangi 1

				System.out.print(arr[i][j] + "\t"); // cetak array
			}
			System.out.println();
		}
	}

}
