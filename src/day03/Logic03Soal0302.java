package day03;

import java.util.*;

public class Logic03Soal0302 {

	protected static Scanner input;

	public static void main(String[] args) {

		// Input
		input = new Scanner(System.in);
		System.out.println("Masukkan Nilai N : ");
		int n = input.nextInt();
		System.out.println("Masukkan Nilai M : ");
		int m = input.nextInt();
		System.out.println("Masukkan NIlai O : ");
		int o = input.nextInt();

		int[][] array = new int[n][n]; // deklarasi array
		// deklarasi variable deret angka
		int[] arr = deretTiga(n * 4, m, o); // n*4 itu jumlah keseluruhan deret dari titik awal
		int index = 0;

		// cetak deret berdasarkan urutan
		// cetak deret atas
		for (int i = 0; i < n; i++) {
			array[0][i] = arr[index];
			index++;
		}

		// cetak deret kanan
		for (int i = 1; i < n; i++) {
			array[i][n - 1] = arr[index];
			index++;
		}

		// cetak deret bawah
		for (int i = n - 2; i >= 0; i--) {
			array[6][i] = arr[index];
			index++;
		}

		// cetak deret kiri
		for (int i = n - 2; i > 0; i--) {
			array[i][0] = arr[index];
			index++;
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

	// method baru untuk menampilkan deret angka
	static int[] deretTiga(int n, int m, int o) {

		int[] deretAngka = new int[n];
		int nilaiAwal = o; // O sebagai nilai awal
		// menampilkan deret dengan looping
		for (int i = 0; i < n; i++) {
			// menampilkan deret angka dengan operator modulus
			if (i % (m + 1) == m) {
				deretAngka[i] = m; // jika hasil bagi antara nilai i dengan m+1 itu bernilai 3, maka cetak ini
			} else {
				deretAngka[i] = nilaiAwal;
				nilaiAwal = nilaiAwal + m; // jika tidak bernilai 3, cetak ini
			}
		}
		return deretAngka;
	}
}
