package day01;

import java.util.*;

public class Logic01Soal0606 {

	public static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		System.out.println("Input Nilai:");
		int n = input.nextInt();

		int number = 1;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.print("*" + "\t");
				number = number + 4;
			} else {
				System.out.print(number + "\t");
				number = number + 4;
			}
		}
	}

}
