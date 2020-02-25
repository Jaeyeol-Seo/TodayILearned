package bj_DFS;

import java.util.Scanner;

public class OrganicCabbage {

	public static int[][] farm;
	public static boolean[][] check;
	public static int[] directionX = { 0, 0, -1, 1 };
	public static int[] directionY = { -1, 1, 0, 0 };

	public static int width, height;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int tcase = sc.nextInt();

		for (int i = 0; i < tcase; i++) {
			width = sc.nextInt();
			height = sc.nextInt();
			int cabbage = sc.nextInt();

			int bug = 0;
			
			farm = new int[height][width];
			check = new boolean[height][width];

			for (int k = 0; k < cabbage; k++) {
				int y = sc.nextInt();
				int x = sc.nextInt();

				farm[x][y] = 1;
			}
			
			for (int n = 0 ; n < height ; n++) {
				for (int m = 0 ; m < width ; m++) {
					if(farm[n][m] != 0) {
						dfs(n, m);
						bug++;
					}
				}
			}
			System.out.println(bug);
		}
	}

	public static void dfs(int a, int b) {

		for (int i = 0; i < 4; i++) {
			int nextX = a + directionX[i];
			int nextY = b + directionY[i];

			if (nextY < 0 || nextX < 0 || nextY >= width || nextX >= height) {
				continue;
			}
			
			if (farm[nextX][nextY] == 0) {
				continue;
			}
			
			farm[nextX][nextY] = 0;
			dfs(nextX, nextY);
		}

	}

}
