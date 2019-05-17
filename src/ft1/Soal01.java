package ft1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soal01 {

	public static void main(String[] args) {
		//deklarasi variabel input
		System.out.println(hargaBarang(new int[] { 10, 20, 30 }, new int[] { 10, 20, 30 }, 10));
	}

	static int hargaBarang(int[] kacamata, int[] baju, int budget) {

		int hasil = 0;

		List<Integer> totalHarga = new ArrayList<Integer>();
		//looping untuk menjumlahkan harga barang, looping sebanyak array tsb
		for (int i = 0; i < kacamata.length; i++) {
			for (int j = 0; j < baju.length; j++) {
				//jika harga kedua barang tidak melebihi budget, maka cetak
				if (kacamata[i] + baju[j] <= budget) {
					//total harga kedua barang
					totalHarga.add(kacamata[i] + baju[j]);
					// System.out.println("Nih Harganya... " + totalHarga);
				} // else if(kacamata[i]+baju[j]>budget) {
					// System.out.println("Yaaah uangnya kurang niiih...");
				// }
			}
		}
		//kalau harganya nol
		if (totalHarga.size() == 0) {
			System.out.println("Yaaah uangnya kurang niiih...");
		//mencari harga tertinggi tetapi tetap dibawah budget
		} else {
			hasil = Collections.max(totalHarga);
		}

		return hasil;

	}

}
