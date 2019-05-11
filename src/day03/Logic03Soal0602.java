package day03;

import java.util.*;

public class Logic03Soal0602 {

	protected static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		System.out.println("Masukkan N :");
		int n = input.nextInt();
		System.out.println("Masukkan M : ");
		int m = input.nextInt();

		int arr[]=geserArray(n,m);
		int arr2[]=geserArray(n,m);
		
		for (int i = 0; i <=m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[j]+"\t");
			}
			
			for (int k = n-1; k >=0; k--) {
				if(k==n-1) {
					arr[k]=arr2[0];
				} else {
					arr[k]=arr2[k+1];
				}
			}
			
			for (int l = 0; l < n; l++) {
				arr2[l]=arr[l];
			}
			System.out.println();
		}
	}

	static int[] geserArray(int n, int m) {
		
		int deretAngka[]=new int[n];
		int nilaiAwal=2;
		int penambahan=2;
		
		for (int i = 0; i < n; i++) {
			
			deretAngka[i]=nilaiAwal;
			nilaiAwal=nilaiAwal+penambahan;
			penambahan+=2;
		}
		return deretAngka;
	}
}
