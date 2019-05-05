package day01;

import java.util.Scanner;

public class Soal10{
	
	public static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("input your number :");
		int n = Integer.parseInt(input.nextLine());
		int number = 3;
		n=n-2;
		for (int i = 1; i <= n; i++) {
			
			if(i<=3) {
				System.out.print(number + "\t");
				if(i==3) {
					System.out.print("XXX \t");
					number=number*9;
					System.out.print(number +"\t");
				}
				
				number=number*3;
			}

		}

	}
}