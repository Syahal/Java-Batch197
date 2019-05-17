package exercise;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Scanner;

public class Statistic {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Masukkan Data: ");
		String n = input.nextLine();

		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}

		statistikModus(arrayInput);
		statisticMedian(arrayInput);
		statistikMean(arrayInput);
		sortArray(arrayInput);
	}

	public static void sortArray(int[] array) {

		int temp = 0;
		// looping iterasi
		for (int i = 0; i < array.length; i++) {
			// looping pembanding
			for (int j = 0; j < array.length - 1; j++) {
				// jika array sebelumnya lebih besar dari array sesudahnya
				if (array[j] > array[j + 1]) {
					// simpan nilai sementara di array sebelumnya
					temp = array[j];
					// berikan nilai array sesudah kepada array sebelum
					array[j] = array[j + 1];
					// berikan nilai sementara kepada array sesudah
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void statistikModus(int[] array) {

		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		// looping sepanjang array
		for (int i = 0; i < array.length; i++) {
			// .containskey berfungsi sbg pembanding
			if (data.containsKey(array[i])) {
				int value = data.get(array[i]);
				value++;
				// update jumlah kemunculan nilai
				data.put(array[i], value);
			} else {
				data.put(array[i], 1);
			}
		}

		int key = Collections.max(data.entrySet(), Map.Entry.comparingByValue()).getKey();
		int value = Collections.max(data.values());
		System.out.println("Modus : " + key + " Value : " + value);
	}

	public static void statistikMean(int[] array) {

		double sum = 0;
		double average = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		average = (double) (sum / array.length);
		System.out.println("Mean : " + average);
	}

	public static void statisticMedian(int[] array) {

		float median = 0;

		if (array.length % 2 == 0) {
			median = (float) (array[(array.length - 1) / 2] + array[((array.length - 1) / 2) + 1] / 2);
		} else {
			median = (float) (array[array.length / 2]);
		}

		System.out.println("Median = " + median);
	}
}
