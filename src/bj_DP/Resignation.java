package bj_DP;

//BOJ 14501
import java.util.Arrays;
import java.util.Scanner;

public class Resignation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] t = new int[N + 2];
		int[] p = new int[N + 2];
		int[] dp = new int[N + 2];
		
		for(int i = 1 ; i <= N ; i++) {
			t[i] = sc.nextInt();
			p[i] = sc.nextInt();
		}
		
		for(int i = N ; i > 0 ; i--) {
			int index = i + t[i];
			 
            if(index <= N + 1) {
            	dp[i] = Math.max(p[i] + dp[index], dp[i + 1]);
            } else dp[i] = dp[i + 1];
		}
		
		Arrays.sort(dp);
		
		System.out.println(dp[dp.length - 1]);
	}

}
