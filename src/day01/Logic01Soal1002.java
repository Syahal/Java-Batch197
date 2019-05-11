package day01;

import java.util.*;

public class Logic01Soal1002 {

	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input Nilai:");
		int n = input.nextInt();

		int number = 3;

		for (int i = 1; i <= n; i++) {
			if (i % 4 == 0) {
				System.out.print("XXX \t");
			} else {
				System.out.print(number + "\t");
				number = number * 3;
			}
		}
	}

}
