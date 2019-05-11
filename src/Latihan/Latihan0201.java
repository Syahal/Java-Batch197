package Latihan;

public class Latihan0201 {

	public static void main(String[] args) {

		int n = 9;
		int a = 1;
		
		//pindah baris
		for (int i = 0; i < n; i++) {
			//pindah kolom
			for (int j = 0; j < n; j++) {
				if(i==j) {
					System.out.print(a+"\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
			a+=2; //sebelum pindah ke baris berikutnya, ditambah 2 dulu
		}
	}

}
