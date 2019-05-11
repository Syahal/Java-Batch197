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
		
	}

}
