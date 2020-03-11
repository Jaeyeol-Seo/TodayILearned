package bj_DP;

//BOJ 11055
import java.util.Scanner;

public class SumOfLIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int[] arr = new int[N];
		int[] dp = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			arr[i] = sc.nextInt();
			dp[i] = arr[i];
		}
		
		int max = 0;
		
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0 ; j < i ; j++) {
				if ( arr[i] > arr[j] && dp[i] < dp[j] + arr[i]) {
					dp[i] = dp[j] + arr[i];
				}
			}
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
	}

}
