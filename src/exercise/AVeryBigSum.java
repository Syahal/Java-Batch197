package exercise;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		if (N >= 1 && N <= 10) {
			long result = 0;
			for (int i = 0; i < N; i++) {
				result += in.nextLong();
			}
			System.out.println(result);
		}

		long case1 = aVeryBigSum(new long[] { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 });
		System.out.println(case1);

	}

	static long aVeryBigSum(long[] arr) {

		int n = arr.length;
		long result = 0;
		for (int i = 0; i < n; i++) {
			result += arr[i];
		}

		return result;
	}

}
