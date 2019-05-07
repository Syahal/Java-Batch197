package day03;

import java.util.*;

public class Logic03Soal03 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Masukkan Nilai N = ");
		int n = input.nextInt();
		System.out.println("Masukkan Nilai M = ");
		int m = input.nextInt();
		System.out.println("Masukkan Nilai O = ");
		int o = input.nextInt();

		int[][] array = new int[n][n]; //deklarasi array
		//deklarasi variable deret angka
		int[] arr = deretTiga(n * 4, m, o);
		int index = 0;

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
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

	// buat method tambahan
	static int[] deretTiga(int n, int m, int o) {
		int array[] = new int[n];
		int angka = o; // o sbg nilai awal
		for (int i = 0; i < n; i++) { // menampilkan deret angka
			if (i % (m + 1) == m) { // menampilkan angka tiga dengan menggunakan operator modulus
				array[i] = m;
			} else {
				array[i] = angka;
				angka += m;
			}
		}
		return array;
	}
}
