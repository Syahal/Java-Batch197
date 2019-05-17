package exercise;

import java.util.Arrays;

public class MinMax {
 
    // pastebin.com/
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 1 2 4 7 8 6 9
        // diminta 4 komponen terrendah & tertinggi
 
        int[] arrayInput = new int[] { 2, 4, 5, 6, 7, 8, 9 };
        Arrays.sort(arrayInput);
 
        miniMaxSum(arrayInput);
    }
 
    static void miniMaxSum(int[] arr) {
       
        long sumMinKeN = 0;
        long sumMaxKeN = 0;
       
        int n = 4;
        for (int j = 0; j < n; j++) {
            sumMinKeN += arr[j];
            sumMaxKeN += arr[arr.length -1 -j];
        }
        System.out.println(sumMinKeN + " " +sumMaxKeN);
    }
}