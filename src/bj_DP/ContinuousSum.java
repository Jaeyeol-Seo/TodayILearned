package bj_DP;

//BOJ 1912
import java.util.Scanner;

public class ContinuousSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		int[] csum = new int[n];
		int max;
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		csum[0] = arr[0];
		max = arr[0];
		
		for(int i = 1 ; i < n ; i++) {
			csum[i] = Math.max(arr[i], arr[i] + csum[i - 1]);
			
			max = Math.max(max, csum[i]);
		}
		
		System.out.println(max);
	}


}
