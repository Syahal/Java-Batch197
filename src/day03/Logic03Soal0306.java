package day03;

import java.util.*;

public class Logic03Soal0306 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Masukkan Nilai N : ");
		int n = input.nextInt();
		System.out.println("Masukkan Nilai M : ");
		int m = input.nextInt();
		System.out.println("Masukkan NIlai O : ");
		int o = input.nextInt();

		int[][] array = new int[n][n];

		int[] arr = deretTiga(n * 4, m, o);
		int index = 0;

		for (int i = 0; i < n; i++) {
			array[0][i] = arr[index];
			index++;
		}

		for (int i = 1; i < n; i++) {
			array[i][n - 1] = arr[index];
			index++;
		}

		for (int i = n - 2; i >= 0; i--) {
			array[6][i] = arr[index];
			index++;
		}

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

	static int[] deretTiga(int n, int m, int o) {

		int[] deretAngka = new int[n];
		int nilaiAwal = o;

		for (int i = 0; i < n; i++) {
			//modulo (%) == sisa pembagian
			if (i % (m + 1) == m) {
				deretAngka[i] = m;
			} else {
				deretAngka[i] = nilaiAwal;
				nilaiAwal = nilaiAwal + m;
			}
		}
		return deretAngka;
	}

}
