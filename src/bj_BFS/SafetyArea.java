package bj_BFS;

//BOJ 2468
import java.util.Scanner;

public class SafetyArea {

	public static int[][] arr;
	public static boolean[][] check;
	public static int N;
	public static int area;
	public static int[] nextX = { 0, 0, -1, 1 };
	public static int[] nextY = { -1, 1, 0, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		arr = new int[N][N];
		
		int temp = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] > temp) {
					temp = arr[i][j];
				}
			}
		}

		int max = 1;

		for (int k = 1; k <= temp; k++) {
			check = new boolean[N][N];
			area = 0;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] > k && check[i][j] == false) {
						area++;
						findArea(i, j, k);
					}
				}
			}
			max = Math.max(max, area);
		}
		
		System.out.println(max);

	}

	public static void findArea(int x, int y, int water) {
		check[x][y] = true;
		
		for (int i = 0; i < 4; i++) {
			int nx = x + nextX[i];
			int ny = y + nextY[i];

			if (0 <= nx && nx < N && 0 <= ny && ny < N) {
				if (arr[nx][ny] > water && check[nx][ny] == false)
					findArea(nx, ny, water);
			}
		}
	}

}
