package exercise;

import java.util.Scanner;
import java.util.*;

public class LatihanOp {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		int panjang, lebar, tinggi, luas, volume;
		
		System.out.println("MENGHITUNG LUAS");
		System.out.print("panjang  = ");
		panjang = userInput.nextInt();
		System.out.print("lebar = ");
		lebar = userInput.nextInt();
		
		luas = panjang * lebar;
		System.out.println("luas = " + luas);
		
		System.out.println("MENGHITUNG VOLUME");
		System.out.print("tinggi  = ");
		tinggi = userInput.nextInt();

		volume = luas * tinggi;
		System.out.println("volume = " + volume);
		
		System.out.println("\n\n\n");
		
		//Pengelompokan, pengurutan Operator Aritmatika
		//perkalian atau pembagian akan di eksekusi terlebih dahulu daripada penambahan atau pengurangan
		//Jika operasi dilakukan dengan perkalian dan pembagian, maka akan dilakukan operasinya dari kiri ke kanan
		
		int hasil = 5 * 10 / 2;
		System.out.println(hasil);
		hasil = 5 + 2 - 10;
		System.out.println(hasil);
		
		//menggunakan pengelompokan dengan operasi ()
		hasil = 60 / (2 + 10);
		System.out.println(hasil);
		
		System.out.println("\n\n\n");
		
		//membuat sebuah objek untuk menangkap input dari user
		Scanner inputUser = new Scanner(System.in);
		
		//tebak angka
		int nilaiBenar = 6;
		int nilaiTebakan;
		boolean statusTebakan;
		
		System.out.print("Masukkan nilai tebakan anda : ");
		nilaiTebakan = inputUser.nextInt();
		System.out.println("nilai tebakan anda adalah : " + nilaiTebakan);
		
	}

}
