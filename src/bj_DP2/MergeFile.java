package bj_DP2;

import java.util.Arrays;
import java.util.Scanner;

public class MergeFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
//		int tcase = sc.nextInt();
		
		int n = 15;
		int[] ar = new int[n];
		
		for(int i = 0 ; i < ar.length ; i++) {
			ar[i] = sc.nextInt();
		}
		
		Arrays.sort(ar);
		
		for(int i : ar) {
			System.out.print(i + " ");
		}
	}

}
