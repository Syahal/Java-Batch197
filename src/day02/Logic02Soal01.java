package day02;

import java.util.*;

public class Logic02Soal01 {
	
	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Masukkan Nilai N1");
		int n1 = input.nextInt();
		System.out.println("Masukkan Nilai N2");
		int n2 = input.nextInt();
		int[] deretAngka = new int[n1];
		int nilaiAwal = 1;
		int hasilHitung;
		
		for (int i = 0; i < n1; i++) {
			deretAngka[i] = nilaiAwal;
			System.out.print(deretAngka[i] + "\t");
			nilaiAwal = nilaiAwal * n2;
		}
		
		System.out.println("\n");
		
		System.out.print("Perhitungan => ");
	}

}
