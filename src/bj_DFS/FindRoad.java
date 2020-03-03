package bj_DFS;

//BOJ 11403
import java.util.Arrays;
import java.util.Scanner;

public class FindRoad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		boolean[] check = new boolean[n];
		int[][] ans = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			dfs(arr, check, i);
			for(int j = 0 ; j < n ; j++) {
				if(check[j] == true) {
					ans[i][j] = 1;
				}
			}
			Arrays.fill(check, false);
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static void dfs(int[][] arr, boolean[] check, int a) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[a][i] == 1 && check[i] == false) {
				check[i] = true;
				dfs(arr, check, i);
			}
		}
	}

}
