package bj_DP;

import java.util.Scanner;

public class SumOfTDA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] arr = new int[N + 1][M + 1];
		
		for(int i = 1 ; i <= N ; i++) {
			for(int j = 1 ; j <= M ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int tcase = sc.nextInt();
		
		for(int i = 0 ; i < tcase ; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			
			int sum = 0;
			
			for(int j = x1 ; j <= x2 ; j++) {
				for(int k = y1 ; k <= y2 ; k++) {
					sum += arr[j][k];
				}
			}
			
			System.out.println(sum);
		}
	}

}
