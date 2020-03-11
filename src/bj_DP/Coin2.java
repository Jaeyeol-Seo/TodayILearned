package bj_DP;

import java.util.Arrays;
import java.util.Scanner;

public class Coin2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] coin = new int[N];
		int[] dp = new int[N];
		
		for(int i = 0 ; i < N ; i++) {
			coin[i] = sc.nextInt();
		}
		
		Arrays.sort(coin);
		
		int cnt = Integer.MAX_VALUE;
		
		for(int i = coin.length - 1 ; i >= 0 ; i--) {
			int rest = K % coin[i];
			if( rest != 0 ) {
				for(int j = i - 1 ; j >= 0 ; j-- ) {
					
				}
			}
			dp[i] += K / coin[i];
		}
	}

}
