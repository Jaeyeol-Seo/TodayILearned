package bj_DP1;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		int[] dp = new int[length];
		
		for(int i = 0 ; i < length ; i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
		}
		
		Arrays.sort(arr);
		
		for(int i = 1 ; i < length ; i++) {
			if(arr[i] > arr[i - 1]) {
				dp[i] = dp[i - 1] + 1;
			} else if (arr[i] == arr[i - 1]) {
				dp[i] = dp[i - 1];
			} else continue;
		}
		
		System.out.println(dp[length - 1]);
		
	}

}
