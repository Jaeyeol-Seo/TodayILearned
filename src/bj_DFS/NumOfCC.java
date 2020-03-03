package bj_DFS;

import java.util.Scanner;

public class NumOfCC {

	public static int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr = new int[n + 1][n + 1];
		boolean[] check = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			arr[a][b] = 1;
			arr[b][a] = 1;
		}

		cnt = 0;

		for (int i = 1; i <= n; i++) {
			cnt += dfs(arr, check, i);
		}
		
		System.out.println(cnt);
	}

	public static int dfs(int[][] arr, boolean[] check, int a) {
		if (check[a])
			return 0;

		check[a] = true;
		for (int i = 1; i <= arr.length - 1; i++)
			if (arr[a][i] != 0)
				dfs(arr, check, i);
		return 1;
	}

}
