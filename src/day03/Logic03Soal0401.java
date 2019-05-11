package day03;

import java.util.*;

public class Logic03Soal0401 {

	protected static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = new Scanner(System.in);
		System.out.println("Masukkan Nilai N : ");
		int n = input.nextInt();
		System.out.println("Masukkan Nilai M");
		int m = input.nextInt();
		
		int[] arr = geserArray(n, m);

		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.println(arr[j] + "\t");
			}
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
