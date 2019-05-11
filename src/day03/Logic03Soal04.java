package day03;

import java.util.*;

public class Logic03Soal04 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Masukkan Nilai N : ");
		int n = input.nextInt();
		System.out.println("Masukkan Nilai M : ");
		int m = input.nextInt();

		// deklarasi variable
		int[] arr = geserArray(n, m);
		int[] arr2 = new int[n];
		//step 2.. menampilkan deret baris pertama
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j] + "\t");
			}
		// step 3
		for (int k = 0; k < n; k++) {
				//mengambil data/angka paling belakang utk di pindahkan ke baris berikutnya di posisi paling depan
				if (k - 1 < 0) {
					// System.out.print("if\t");
					arr2[k] = arr[n - 1];
				} 
				//menggeser deret angka ke kanan
				else {
					arr2[k] = arr[k - 1];
					// System.out.print("else\t");
				}
			}
			//step 4
			//looping utk mengganti array 1 dengan yang baru, dengan mengambil data ke array 2
			for (int l = 0; l < n; l++) {
				arr[l] = arr2[l];
			}
			System.out.println();
		}

	}

	// step 1.. new method (menghitung pola deret angka dengan ketentuan penambahan +1)
	static int[] geserArray(int n, int m) {

		int hasilDeret[] = new int[n];
		int nilaiAwal = 1;
		int tambah = 2; //angka penambah untuk deret selanjutnya
		//looping deret angka
		for (int i = 0; i < n; i++) {
			hasilDeret[i] = nilaiAwal;
			nilaiAwal = nilaiAwal + tambah;
			tambah = tambah + 1; // dari angka 2 itu, ditambah lagi +1 supaya perulangannya bertingkat
		}
		return hasilDeret;
	}

}
