package day03;

import java.util.*;

public class Logic03Soal0203 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.print("Input Nilai N : ");
		int n = input.nextInt();
		System.out.print("Input Nilai M : ");
		int m = input.nextInt();
		System.out.print("Input Nilai O : ");
		int o = input.nextInt();

		int[][] array = new int[n][n];

		int[] arr = deretTiga(n * 3, m, o);
		int index = 0;

		for (int i = n - 1; i >= 0; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1) {
					array[i][j] = arr[index];
					j++;
					index++;
				}
			}
		}

		for (int i = 1; i < n; i++) {
			array[i][n - 1] = arr[index];
			index++;
		}

		for (int i = n - 2; i > 0; i--) {
			array[6][i] = arr[index];
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

		int deretAngka[] = new int[n];
		int nilaiAwal = o;
		int kali = 1;

		for (int i = 0; i < n; i++) {
			if (i % (m + 1) == m) {
				deretAngka[i] = (m * kali);
				kali = deretAngka[i];
			} else {
				deretAngka[i] = nilaiAwal;
				nilaiAwal = nilaiAwal + m;
			}
			// System.out.println(deretAngka[i] + " ");
		}

		return deretAngka;
	}

}
