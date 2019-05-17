package ft1;

import java.util.Scanner;

public class Soal04 {

	public static void main(String[] args) {
		// deklarasi input variabel
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan Nama: ");
		// deklarasi variabel
		String nama = input.nextLine();
		// charAt > mencari karakter dari String tsb berdasarkan indexnya
		String namaTersensor = String.valueOf(nama.charAt(0));
		// menyimpan karakter awal utk nanti ditampilkan
		char karakterSebelumnya = nama.charAt(0);
		char karakterSelanjutnya;
		char karakterDisisipkan;

		int panjangKalimat = nama.length();

		// index dimulai dari 1, karena index 0 itu sudah di simpan karakternya utk
		// ditampilkan
		for (int i = 1; i < panjangKalimat; i++) {
			//
			if (i + 1 < panjangKalimat) {
				// cari karakter sebelum dan sesudah kalimat yang di urut
				karakterSelanjutnya = nama.charAt(i + 1);
				karakterSebelumnya = nama.charAt(i - 1);
				// bernilai true jika diantara karakter sebelum dan sesudah atau karakter di
				// index tsb berisi spasi,
				if (karakterSelanjutnya == ' ' || karakterSebelumnya == ' ' || nama.charAt(i) == ' ') {
					// Masukan karakter apabila karakter tsb spasi
					// atau karakter sebelumnya atau sesudahnya adalah spasi
					karakterDisisipkan = nama.charAt(i);
				} else {
					karakterDisisipkan = '*';
				}
			} else {
				// karakter terakhir harus tetap utuh
				karakterDisisipkan = nama.charAt(i);
			}
			namaTersensor = namaTersensor + karakterDisisipkan;
		}
		System.out.println("\nHasil Sensor Nama : \n" + namaTersensor + "\n");
	}

}

//
