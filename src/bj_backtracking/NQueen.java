package bj_backtracking;

//BOJ 9663
import java.util.Scanner;

public class NQueen {

	public static int[] chessboard;
	public static int cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int tcase = sc.nextInt();

		chessboard = new int[tcase];

		for (int i = 0; i < tcase; i++) {
			chessboard[0] = i; // 배열 인덱스 = x // 배열 값 = y
			nQueen(0);
		}
		
		System.out.println(cnt);
	}

	public static void nQueen(int y) {
		if ( y == chessboard.length - 1) {
			cnt++;
			return;
		}
		for (int i = 0; i < chessboard.length; i++) {
			chessboard[y + 1] = i;
			if (isEnable(y + 1)) {
				nQueen(y + 1);				
			} else {
				continue;
			}
		}
	}

	public static boolean isEnable(int next) {
		for (int i = 0; i < next; i++) {
			if (chessboard[i] == chessboard[next]) { // x, y 좌표가 같은 경우
				return false;
			}
			else if (Math.abs(i - next) == Math.abs(chessboard[i] - chessboard[next])) { // 대각선
				return false;
			}
		}
		return true;
	}

}
