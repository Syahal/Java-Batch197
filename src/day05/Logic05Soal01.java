package day05;

public class Logic05Soal01 {
	
	public static void main(String[] args) {

		int namaVariable; //tentukan tipe data and next buat nama Variabelnya
		Orang org01 = new Orang();//"Orang" itu sebuah tipe data dengan "org01" sebagai object
		//input
		org01.id = 100000;
		org01.nama = "Ahmad Sahal";
		org01.alamat = "Jakarta";
		org01.jk = "Laki-laki";
		org01.noTelp = "081382492921";
		//output
		System.out.println("ID		: " + org01.id);
		System.out.println("Nama	: " + org01.nama);
		System.out.println("Alamat	: " + org01.alamat);
		System.out.println("JK		: " + org01.jk);
		System.out.println("No Telp : " + org01.noTelp);
		
		org01.id = 2;
		org01.cetakData();
		
		Orang org03 = new Orang();
		//input
		org03.id = 300000;
		org03.nama = "Arif";
		org03.alamat = "Bekasi";
		org03.jk = "Laki-laki";
		org03.noTelp = "12345";
		//output
		org03.cetakData();
		
		int hasil = org03.perhitungan(3, 4, 5);
		System.out.println(hasil);
		
		for (int i = 0; i < 100; i++) {
			Orang org = new Orang();
		}
		
	}

}
