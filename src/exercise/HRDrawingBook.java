package exercise;

import java.util.*;

public class HRDrawingBook {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int p = in.nextInt();
		int result = pageCount(n, p);
		System.out.println(result);

	}

	static int pageCount(int n, int p) {

		int turns = 0;
		int half = n / 2;

		if (p > half) {
			int back = n - p;
			if (back > 1) {
				turns = back / 2;
			} else if (n % 2 == 0 && back == 1) {
				turns = 1;
			}
		} else {
			if (p > 1) {
				turns = p / 2;
			}
		}
		return turns;
	}

}
