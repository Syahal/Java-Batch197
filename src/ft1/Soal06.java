package ft1;

import java.util.Scanner;;

public class Soal06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// 1. banyak angka yang mau di input
		System.out.println("Masukkan banyaknya Angka : ");

		// scan banyaknya angka
		int banyakAngka = input.nextInt();

		// 2. banyak angka minimal sama dengan 4 angka
		if (banyakAngka >= 4) {
			int[] deretAngka = new int[banyakAngka];

			// 3. cetak hasil input angka sesuai dengan perintah
			for (int i = 0; i < banyakAngka; i++) {
				System.out.println("Angka ke- " + (i + 1) + (": "));
				deretAngka[i] = input.nextInt();
			}

			// 4. deklarasiin penyimpanan angka temporary(sementara). looping sebanyak angka
			// yang di input
			// sorting angka juga disini
			int temp;
			for (int i = 0; i < banyakAngka; i++) {
				for (int j = 0; j < banyakAngka; j++) {
					if (deretAngka[j] < deretAngka[i]) {// jika angka di index ke[j] lebih kecil dari angka di index
														// ke[i]
						temp = deretAngka[i]; // maka simpan angka index[i] tsb di temporary
						deretAngka[i] = deretAngka[j]; // pindahkan angka index ke [j] ke angka index ke[i]
						deretAngka[j] = temp; // balikkan angka yang di temp ke index[j]
					}
				}
			}

			int nilaiMinPenjumlahan = 0; // deklarasi variabel utk menuliskan hasil nilai min penjumlahan
			int nilaiMaxPenjumlahan = 0; // deklarasi variabel utk menuliskan nilai max yang akan dijumlahkan
			String nilaiMinKalimat = ""; // deklarasi penjumlahan angka
			String nilaiMaxKalimat = ""; // deklarasi penjumlahan angka

			for (int i = 0; i < 4; i++) { // mengambil angka dari array[i]
				nilaiMinPenjumlahan = nilaiMinPenjumlahan + deretAngka[i]; // menjumlahakan nilai min penumlahan
																			// ditambah dengan angka di array ke[i]

				if (i < 3) {
					nilaiMinKalimat = nilaiMinKalimat + deretAngka[i] + "+";
				} else {
					nilaiMinKalimat = nilaiMinKalimat + deretAngka[i] + "=";
				}
			}
			System.out.println("Nilai Minimal Penjumlahan = " + nilaiMinKalimat + nilaiMinPenjumlahan);

			for (int i = banyakAngka - 1; i >= banyakAngka - 4; i--) { // mengambil angka dari array[i]
				nilaiMaxPenjumlahan = nilaiMaxPenjumlahan + deretAngka[i]; // menjumlahakan nilai max penumlahan
																			// ditambah dengan angka di array ke[i]

				if (i > banyakAngka - 4) {
					nilaiMaxKalimat = nilaiMaxKalimat + deretAngka[i] + "+";
				} else {
					nilaiMaxKalimat = nilaiMaxKalimat + deretAngka[i] + "=";
				}
			}
			System.out.println("Nilai Maximal Penjumlahan = " + nilaiMaxKalimat + nilaiMaxPenjumlahan);
			// jika tidak sebanyak 4 buah angka, maka ulangi
		} else {
			System.out.println("Minimal banyaknya Angka adalah 4! Ulangi!");
		}
	}

}
