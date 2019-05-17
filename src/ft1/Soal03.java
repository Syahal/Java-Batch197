package ft1;

import java.util.Scanner;

public class Soal03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//1. masukkan banyaknya angka
		System.out.println("Masukkan Banyak Angka:");

		//2. Scan banyaknya angka
		int banyakAngka = input.nextInt();
		int[] deretAngka = new int[banyakAngka];

		//3. looping scan masing-masing angka
		for (int i = 0; i < banyakAngka; i++) {
			//4. input angka sesuai ketentuan banyaknya angka
			System.out.print("Angka Ke-" + (i + 1) + (": "));
			deretAngka[i] = input.nextInt();
		}

		// Deklarasi temporary variable
		int temp;
		for (int i = 0; i < banyakAngka; i++) { //sorting angka dengan loop
			for (int j = i + i; j < banyakAngka; j++) {
				if (deretAngka[j] < deretAngka[i]) { //akan berlanjut jika angka pada index [j] lebih kecil dari angka di index[i]
					temp = deretAngka[i]; // simpan angka index ke[i] di penyimpanan temporary
					deretAngka[i] = deretAngka[j];// pindahkan angka index ke[j] ke index[i]
					deretAngka[j] = temp; //angka yg di simpan di temp dikembalikan ke dlm index[j]
				}
			}
		}

		// Tampilkan angka
		System.out.println("\n\nHasil: ");
		for (int i = 0; i < deretAngka.length; i++) {
			System.out.print(" " + deretAngka[i] + " ");
		}

		System.out.println("\n\n");
	}

}
