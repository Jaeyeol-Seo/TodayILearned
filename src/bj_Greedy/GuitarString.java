package bj_Greedy;

//BOJ 1049
import java.util.Scanner;

public class GuitarString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int min6 = 1001;
		int min1 = 1001;

		for (int i = 0; i < M; i++) {
			min6 = Math.min(min6, sc.nextInt());
			min1 = Math.min(min1, sc.nextInt());
		}

		int mincost = Integer.MAX_VALUE;

		mincost = Math.min(((N / 6) + 1) * min6, N * min1);
		mincost = Math.min(mincost, ((N / 6)) * min6 + (N % 6) * min1);

		System.out.println(mincost);
	}

}
