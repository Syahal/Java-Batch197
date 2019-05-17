package ft1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
		// Cases Dinamis Input untuk mengecek apakah termasuk Pangram atau bukan
		System.out.println("Masukkan kalimat: ");
		Scanner in = new Scanner(System.in);
        System.out.println(penentuanPangram(in.nextLine()));
        in.close();
        
	}
	
	// Method untuk menampilkan hasil pengecekan
	public static String penentuanPangram(String sentence) {
        return (pangram(sentence)) ? "It's a PANGRAM" : "It's NOT a PANGRAM";
    }

    //Method mengecek kalimat apakah termasuk pangram
	public static boolean pangram(String sentence) { //menggunakan boolean
        String lowerSentence = sentence.toLowerCase(); //menggunakan fungsi toLowerCase untuk mengubah jika ada huruf besar menjadi huruf kecil
        for (char letter = 'a'; letter <= 'z'; letter++) { //melakukan looping pengecekan kalimat dari huruf 'a' sampai 'z' dan menyimpannya ke dalam index letter jika ada huruf tersebut
            if (lowerSentence.indexOf(letter) < 0) return false;  //jika ada jenis huruf yg tidak di simpan dalam index 0 letter maka hasilnya false
        }
        return true;  //jika semua index letter terisi maka true
    }

}
