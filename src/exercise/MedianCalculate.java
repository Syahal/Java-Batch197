package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MedianCalculate {

	public static float mean(int[] values) {

		int sum = 0;
		int average = 0;
		int length = values.length;

		for (int i = 0; i < length; i++) {
			sum += values[i];
			average = sum / length;
		}
		return average;
	}

	public static int median(int[] values) {

		int length = values.length;
		int[] sort = new int[length];
		System.arraycopy(values, 0, sort, 0, sort.length);
		Arrays.sort(sort);

		if (length % 2 == 0) {
			return (sort[(sort.length / 2) - 1] + sort[sort.length / 2]) / 2;
		} else {
			return sort[sort.length / 2];
		}
	}

	public static int mode(int[] values) {

		int max = 0, maxCount = 0;
		int length = values.length;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = 0; j < length; ++j) {
				if (values[j] == values[i])
					++count;
			}

			if (count > maxCount) {
				maxCount = count;
				max = values[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		Scanner nums = new Scanner(System.in);

		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.println("Masukkan Nilai : ");
			num[i] = nums.nextInt();
		}

		float mean = MedianCalculate.mean(num);
		System.out.println("Mean = " + mean);
		int median = MedianCalculate.median(num);
		System.out.println("Median = " + median);
		int mode = MedianCalculate.mode(num);
		System.out.println("Mode = " + mode);
	}

}
