package day03;

import java.util.*;

public class Logic03Soal0103 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input N : ");
		int n = Integer.parseInt(input.nextLine());

		int arr[][] = new int[n][n];
		// deklarasi variable deret angka1
		int[] deretAngka1 = new int[n];
		int nilaiAwal1 = 1;
		// mencari deret angka 1
		for (int i = 0; i < deretAngka1.length; i++) {
			deretAngka1[i] = nilaiAwal1;
			nilaiAwal1 = nilaiAwal1 + (i + 2);
		}

		// deklarasi variable deret angka2
		int[] deretAngka2 = new int[n];
		int nilaiAwal2 = 2;
		// mencari deret angka 2
		for (int j = 0; j < deretAngka2.length; j++) {
			deretAngka2[j] = nilaiAwal2;
			nilaiAwal2 = nilaiAwal2 + (2 * (j + 1));
		}

		// hitung diagonal
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// hitung diagonal dari kiri atas ke kanan bawah dengan kondisi
				if (i == j) {
					arr[i][j] = deretAngka1[i];
					// hitung diagonal dari kiri bawah ke kanan atas dengan kondisi
				} else if (i + j == n - 1) { // rumus baris+kolom == jumlah array dikurangi 1
					arr[i][j] = deretAngka2[j];
				}
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}