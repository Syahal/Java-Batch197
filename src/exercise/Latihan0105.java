package exercise;

public class Latihan0105 {

	public static void main(String[] args) {

		int n = 9;
		int t = n/2;
		int a = n-1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i+j == a || i == j || i == t || j == t || i == 0 || j == 0 || i == a || j == a  ) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("\n");
		}
	}
}

