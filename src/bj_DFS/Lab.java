package bj_DFS;

//BOJ 14502
import java.util.ArrayList;
import java.util.Scanner;

public class Lab {

	public static int N, M;
	public static int[][] lab, copylab;
	public static ArrayList<Virus> list;
	public static int[] virusX = { 0, 0, -1, 1 };
	public static int[] virusY = { -1, 1, 0, 0 };
	public static int max = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		lab = new int[N][M];
		copylab = new int[N][M];
		list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				lab[i][j] = sc.nextInt();
				if (lab[i][j] == 2) {
					list.add(new Virus(i, j));
				}
			}
		}
		
		setWall(0, 0);
		System.out.println(max);
	}

	public static void setWall(int start, int num) {
		if (num == 3) {
			copyLab();

			for (Virus v : list)
				spreadVirus(v.x, v.y);

			max = Math.max(max, getSafeArea());
			return;
		}

		for (int i = start; i < N * M; i++) {
			int x = i / M;
			int y = i % M;

			if (lab[x][y] == 0) {
				lab[x][y] = 1;
				setWall(i + 1, num + 1);
				lab[x][y] = 0;
			}
		}
	}

	public static void copyLab() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				copylab[i][j] = lab[i][j];
			}
		}
	}

	static void spreadVirus(int x, int y) {
		for (int i = 0; i < 4; i++) {
			int nx = x + virusX[i];
			int ny = y + virusY[i];

			if (0 <= nx && nx < N && 0 <= ny && ny < M) {
				if (copylab[nx][ny] == 0) {
					copylab[nx][ny] = 2;
					spreadVirus(nx, ny);
				}
			}
		}
	}

	static int getSafeArea() {
		int safe = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (copylab[i][j] == 0)
					safe++;
			}
		}
		return safe;
	}

}

class Virus {
	int x, y;

	Virus(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
