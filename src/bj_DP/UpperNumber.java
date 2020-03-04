package bj_DP;

import java.util.Scanner;

public class UpperNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[][] arr = new int[1001][10];
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[1][i] = 1;
		}
		
		for(int i = 2 ; i < 1001 ; i++) {
			for(int j = 0 ; j < 10 ; j++) {
				for(int k = 0 ; k <= j ; k++) {
					arr[i][j] += arr[i - 1][k];
					arr[i][j] %= 10007;
				}
			}
		}
		
		int ans = 0;
		for(int i = 0 ; i < 10 ; i++) {
			ans += arr[N][i];
		}
		
		System.out.println(ans % 10007);
	}

}
