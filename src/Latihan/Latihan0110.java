package Latihan;

public class Latihan0110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		int t = n/2;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i >= j && i <= t || i <= j && i>= t){
					System.out.print("*\t");
				}else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
		
	}

}
