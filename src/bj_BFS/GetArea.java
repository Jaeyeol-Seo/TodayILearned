package bj_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GetArea {

	public static int N, M, K;
	public static int[][] arr;
	public static ArrayList<Integer> list;
	public static int[] nextX = { 0, 0, -1, 1 };
	public static int[] nextY = { -1, 1, 0, 0 };
	public static int areaNum, area;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr = new int[N][M];

		K = sc.nextInt();

		for (int i = 0; i < K; i++) {
			int y1 = sc.nextInt();
			int x1 = sc.nextInt();
			int y2 = sc.nextInt();
			int x2 = sc.nextInt();

			paintArr(x1, y1, x2, y2);
		}
		
		list = new ArrayList<>();
		area = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				areaNum = 0;
				if (arr[i][j] == 0) {
					area++;
					findArea(i, j);
					list.add(areaNum);
				}
			}
		}
		
		Collections.sort(list);
		
		System.out.println(area);
		for(int i : list) {
			System.out.print(i + " ");
		}
	}

	public static void paintArr(int x1, int y1, int x2, int y2) {
		for (int i = x1; i < x2; i++) {
			for (int j = y1; j < y2; j++) {
				arr[i][j] = 1;
			}
		}
	}

	public static void findArea(int x, int y) {
		arr[x][y] = 1;
		areaNum++;

		for (int i = 0; i < 4; i++) {
			int nx = x + nextX[i];
			int ny = y + nextY[i];

			if (0 <= nx && nx < N && 0 <= ny && ny < M) {
				if (arr[nx][ny] == 0)
					findArea(nx, ny);
			}
		}
	}
}
