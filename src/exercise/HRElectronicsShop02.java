package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HRElectronicsShop02 {

	public static void main(String[] args) {

		System.out.println(getMoneySpent(new int[] {5,6}, new int[] {9,4,7}, 15));
	}
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		
		int hasil=0;
		
		List<Integer>dd=new ArrayList<Integer>();
		
		for (int i = 0; i < keyboards.length; i++) {
			for (int j = 0; j < drives.length; j++) {
				if(keyboards[i]+drives[j]<=b) {
					dd.add(keyboards[i]+drives[j]);
				}
			}
		}
		
		if(dd.size()==0) {
			hasil=-1;
		} else {
			hasil=Collections.max(dd);
		}
		
		return hasil;
	}

}
