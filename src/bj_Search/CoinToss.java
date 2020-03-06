package bj_Search;

import java.util.Scanner;

public class CoinToss {

	// °ð Á¤º¹ÇÑ´Ù °³»õ³¢....
	public static int N, M, maxcnt;
	public static char[][] arr;
	public static int[][] cnt;

	public static int[] nextX = { 0, 0, -1, 1 };
	public static int[] nextY = { -1, 1, 0, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int maxval = 0;

		N = sc.nextInt();
		M = sc.nextInt();

		int maxlen = N > M ? N : M;

		arr = new char[N][M];
		cnt = new int[N][M];

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j);
				maxval = maxval > (int) arr[i][j] - '0' ? maxval : (int) arr[i][j] - '0';
			}
		}

		if (maxval < maxlen) {
			System.out.println(-1);
			return;
		}

		maxcnt = 1;
		cnt[0][0] = 1;
		playGame(0, 0);

		System.out.println(maxcnt);
	}

	public static void playGame(int y, int x) {
		int mul = (int) arr[y][x] - '0';
		int nx = 0, ny = 0;
		
		for (int i = 0; i < 4; i++) {
			nx = x + (nextX[i] * mul);
			ny = y + (nextY[i] * mul);

			if ((nx >= 0 && nx < M) && (ny >= 0 && ny < N)) {
				if (arr[ny][nx] == 'H') {
					continue;
				}
				if ( cnt[ny][nx] == 0 ) {
					cnt[ny][nx] = cnt[y][x] + 1;
				}
				maxcnt = cnt[ny][nx] > maxcnt ? cnt[ny][nx] : maxcnt;
				if ( maxcnt >= N * M) {
					System.out.println(-1);
					System.exit(0);
				}
				playGame(ny, nx);
			}
		}

	}

}
