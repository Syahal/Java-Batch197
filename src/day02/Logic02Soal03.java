package day02;

import java.util.*;

public class Logic02Soal03 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Masukkan Nilai N1 = ");
		int n1 = input.nextInt();
		System.out.println("Masukkan 7Nilai N2 = ");
		int n2 = input.nextInt();
		System.out.println("Masukkan Nilai N3 = ");
		int n3 = input.nextInt();

		// deklarasi variable array
		int[] deretAngka = new int[n1];
		int nilaiAwal = n2;
		int nilaiTengah = n1 / 2;

		// hitung & menampilkan deret angka dengan looping
		for (int i = 0; i < n1; i++) {
			deretAngka[i] = nilaiAwal;
			if (i < n1 / 2) {
				nilaiAwal = nilaiAwal * n3;
			} else {
				nilaiAwal = nilaiAwal / n3;
			}
			System.out.print(deretAngka[i] + "\t");
		}
		
		System.out.println("\n");
		System.out.print("Perhitungan => " + deretAngka[nilaiTengah]);

		int hasil = deretAngka[nilaiTengah];
		for (int a = nilaiTengah + 1; a < nilaiTengah + 3; a++) {
			hasil = hasil - deretAngka[a];
			System.out.print(" - " + deretAngka[a]);
		}
		System.out.println(" = " + hasil);
	}
}
