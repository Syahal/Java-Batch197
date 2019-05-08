package day03;

import java.util.*;

public class Logic03Soal05 {

	protected static Scanner input;
	
	public static void main(String[] args) {

		//Inputan
		input = new Scanner(System.in);
		System.out.println("Masukkan Nilai N : ");
		int n = input.nextInt();
		System.out.println("Masukkan Nilai M : ");
		int m = input.nextInt();
		
		//deklarasi variable
		int[] arr = geserArray(n, m);
		int[] arr2 = new int[n];
		//menampilkan deret angka baris pertama
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j] + "\t"); //cetak deret
			}
		}
		
		for (int k = 0; k < n; k++) {
			//mengambil data/angka paling belakang utk di pindahkan ke baris berikutnya di urutan paling depan
			
		}
	}
	
	// first step.. new method (menghitung pola deret angka)
	static int[] geserArray(int n, int m) {
		
		int hasilDeret[] = new int[n];
		int nilaiAwal = 2;
		int tambah = 2;
		for (int i = 0; i < n; i++) {
			hasilDeret[i] = nilaiAwal;
			nilaiAwal = nilaiAwal + tambah;
			tambah = tambah + 2;
		}
		
		return hasilDeret;
	}

}
