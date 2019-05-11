package day01;

import java.util.*;

public class Logic01Soal0306 {

	public static Scanner input;

	public static void main(String[] args) {
		
		input=new Scanner(System.in);
		System.out.println("Input Nilai:");
		int n=input.nextInt();
		
		int number=1;
		
		for (int i = 0; i < n; i++) {
			System.out.print(number+"\t");
			number=number+3;
		}

	}

}
