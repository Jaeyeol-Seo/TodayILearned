package bj_DP;

//BOJ 9465
import java.util.Scanner;

public class Sticker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();

			int[][] sticker = new int[2][N + 1];
			int[][] dp = new int[2][N + 1];

			for (int j = 0; j < 2; j++) {
				for (int k = 1; k <= N; k++) {
					sticker[j][k] = sc.nextInt();
				}
			}

			dp[0][1] = sticker[0][1];
			dp[1][1] = sticker[1][1];
			
			for (int j = 2; j <= N; j++) {
				dp[0][j] = Math.max(dp[1][j - 1], dp[1][j - 2]) + sticker[0][j];
				dp[1][j] = Math.max(dp[0][j - 1], dp[0][j - 2]) + sticker[1][j];
			}
			System.out.println(Math.max(dp[0][N], dp[1][N]));

		}
	}

}
