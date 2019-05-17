package exercise;

import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Statistic01 {

	protected static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Masukkan Data");
		String n = input.nextLine();

		String[] arrayString = n.split(" ");
		int[] arrayInput = new int[arrayString.length];

		for (int i = 0; i < arrayString.length; i++) {
			arrayInput[i] = Integer.parseInt(arrayString[i]);
		}

	}

	public static void sortArray(int[] array) {

		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[i + j]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void Mean(int[] array) {

		double sum = 0;
		double mean = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		mean = (double) (sum / array.length);
		System.out.println("Mean = " + mean);
	}

	public static void Median(int[] array) {

		float median = 0;

		if (array.length % 2 == 0) {
			median = (float) (array[(array.length - 1) / 2] + array[((array.length - 1) / 2) + 1]);
		} else {
			median = (float) (array[array.length / 2]);
		}

		System.out.println("Median = " + median);
	}

	public static void Modus(int[] array) {

		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();

		for (int i = 0; i < array.length; i++) {
			if (data.containsKey(array[i])) {
				int value = data.get(array[i]);
				value++;
				data.put(array[i], value);
			} else {
				data.put(array[i], 1);
			}
		}

		int key = Collections.max(data.entrySet(), Map.Entry.comparingByValue()).getKey();
		int value = Collections.max(data.values());
		System.out.println("Modus = " + key + "Value = " + value);
	}
}
