package ft1;

import java.util.Scanner;

public class Soal07 {

	public static void main(String[] args) {

		System.out.println("Input kata : ");
		Scanner input = new Scanner(System.in);
		// deklarasi variabel
		String kata = input.nextLine();
		int panjangKata = kata.length();
		String imbuhan; // simbol
		String imbuhanFinal = "";
		int banyakImbuhan;

		// jika panjang kata di modulus 2 hasilnya = 0, maka cetak simbol
		if (panjangKata % 2 == 0) {
			// Jumlah karakter kata yang genap
			imbuhan = "*";
			banyakImbuhan = panjangKata / 2; // banyaknya simbol yang dicetak
		} else {
			// Jumlah karakter kata yang ganjil
			imbuhan = "*";
			banyakImbuhan = (panjangKata - 1) / 2; // banyaknya simbol yang dicetak
		}

		// buat imbuhan berdasarkan banyaknya imbuhan
		for (int i = 0; i < banyakImbuhan; i++) {
			imbuhanFinal = imbuhanFinal + imbuhan;
		}
		System.out.println("\nHasil : ");
		// cetak huruf dan juga simbol. huruf berdasarkan indexnya
		for (int i = 0; i < panjangKata; i++) {
			System.out.println(kata.charAt(i) + imbuhanFinal + imbuhanFinal);
		}

	}

}