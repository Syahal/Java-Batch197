package day02;

public class MethodOverloadExample {

	public static void main(String[] args) {
		
		//call method minFunction
		int abc = Jumlah(3,4);
		System.out.println("Hasil abc = " + abc);
		//call voidMethod
		Jumlah(3,4);
	}
	
	//method return value with parameter
	public static int Jumlah (int a, int b) {
		return a + b;
	}

	public static void Jumlah (int a, int b, int c) {
		System.out.println("Hasil = " + (a+b+c));
	}
	
	public static String namaLengkap (String namaDepan, String namaBelakang) {
		return namaDepan + namaBelakang;
	}
	
}
