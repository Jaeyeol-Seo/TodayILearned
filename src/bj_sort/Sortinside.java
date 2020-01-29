package bj_sort;

//BOJ 1427
import java.util.Arrays;
import java.util.Scanner;

public class Sortinside {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char[] chararr = str.toCharArray();
		int[] arr = new int[chararr.length];
		
		for (int i = 0 ; i < chararr.length ; i++) {
			arr[i] = ((int)chararr[i] - 48);
		}
		
		Arrays.sort(arr);
		
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
	}

}
