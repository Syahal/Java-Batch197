package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HRElectronicsShop01 {

	public static void main(String[] args) {
		// test case
		System.out.println(getMoneySpent(new int[] { 7, 3 }, new int[] { 4, 9, 3 }, 11));

	}

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {

		int hasil = 0;

		List<Integer> arr = new ArrayList<Integer>();

		// Looping mencari hasil penambahan antara keyboard&drives, tetapi hasil tidak
		// melebihi value di int b
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if (keyboards[i] + drives[i] <= b) {
					arr.add(keyboards[i] + drives[i]);
				}
			}
		}

		//
		if (arr.size() == 0) {
			hasil = -1;
		} else {
			hasil = Collections.max(arr);
		}

		return hasil;
	}

}
