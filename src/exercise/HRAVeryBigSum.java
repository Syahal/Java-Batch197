package exercise;

import java.util.Scanner;

public class HRAVeryBigSum {

	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//		int N = in.nextInt();
//
//		if (N >= 1 && N <= 10) {
//			long result = 0;
//			for (int i = 0; i < N; i++) {
//				result += in.nextLong();
//			}
//			System.out.println(result);
//		}

		long case1 = aVeryBigSum(new long[] { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005 });
		System.out.println(case1);
		long case2 = aVeryBigSum(new long[] { 1001458909, 1004570889, 1007019111, 1003302837, 1002514638, 1006431461, 1002575010, 1007514041, 1007548981, 1004402249 });
		System.out.println(case2);

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
