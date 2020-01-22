package bj_math2;

//BOJ 1002
import java.util.Scanner;

public class Turret {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int tcase = sc.nextInt();

		for (int i = 0; i < tcase; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			findRyu(x1, y1, r1, x2, y2, r2);
		}
		System.out.println(sb);

	}

	public static void findRyu(int a, int b, int x, int m, int n, int y) {

		double cendis = Math.pow((m - a), 2) + Math.pow((n - b), 2);
		double realcd = Math.sqrt(cendis);
		
		if ( a == m && b == n && x == y ) {
			sb.append("-1" + System.lineSeparator());
		} else if ( a == m && b == n && x != y || (realcd > x + y) || (realcd < Math.abs(x - y))) {
			sb.append("0" + System.lineSeparator());
		} else if ( (realcd == x + y) || (realcd == Math.abs(x - y))) {
			sb.append("1" + System.lineSeparator());
		} else sb.append("2" + System.lineSeparator());
		
	}

}
