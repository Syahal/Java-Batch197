package day03;

import java.util.*;

public class Logic03Soal0402 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input Nilai N:");
		int n = input.nextInt();
		System.out.println("Input Nilai M:");
		int m = input.nextInt();

		int[] arr = geserArray(n, m);
		int[] arr2 = new int[n];

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j] + "\t");
			}
			
			for (int k = 0; k < n; k++) {
				if (k - 1 < 0) {
					arr2[k] = arr[n - 1];
				} else {
					arr2[k] = arr[k - 1];
				}
			}

			for (int l = 0; l < n; l++) {
				arr[l] = arr2[l];
			}
			System.out.println();
		}
	}

	static int[] geserArray(int n, int m) {

		int hasilDeret[] = new int[n];
		int nilaiAwal = 1;
		int tambah = 2;

		for (int i = 0; i < n; i++) {
			hasilDeret[i] = nilaiAwal;
			nilaiAwal = nilaiAwal + tambah;
			tambah = tambah + 1;
		}
		return hasilDeret;
	}

}
