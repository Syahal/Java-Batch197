package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HRElectronicsShop {

	public static void main(String[] args) {
		
		//System.out.println(getMoneySpent(new int[] {3,1}, new int[] {5,2,8}, 10));
		// System.out.println(getMoneySpent(new int[] {4}, new int[] {5}, 5));
		System.out.println(getMoneySpent(new int[] {34,26,44}, new int[] {21,39,33}, 70));
	}
	
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        
		int hasil = 0;
		
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
