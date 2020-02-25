package bj_DFS;

import java.util.Arrays;
import java.util.Scanner;

public class FindRoad {

	public static int n;
	public static int[][] graph;
	public static int[][] ans;
	public static boolean[] check;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		graph = new int[n][n];
		ans = new int[n][n];
		check = new boolean[n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < n; i++) {
			dfs(i);
			for (int j = 0; j < n; j++) {
				if (check[i] == true) {
					ans[i][j] = 1;
				}
			}
			Arrays.fill(check, false);
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void dfs(int a) {
		for (int i = 0; i < n; i++) {
			if (graph[a][i] == 1 && check[i] == false) {
				check[i] = true;
				dfs(i);
			}
		}
	}

}
