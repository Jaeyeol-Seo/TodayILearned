package bj_DP1;

//BOJ 11053
import java.util.Arrays;
import java.util.Scanner;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();

		int[] arr = new int[length];
		int[] dp = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
			dp[i] = 1;
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j <= i; j++) {
				if (arr[j] < arr[i] && dp[j] >= dp[i]) {
					dp[i] = dp[j] + 1;
				}
			}
		}

		Arrays.sort(dp);

		System.out.println(dp[length - 1]);

	}

}
