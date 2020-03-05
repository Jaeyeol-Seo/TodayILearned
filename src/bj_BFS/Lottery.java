package bj_BFS;

//BOJ 6603
import java.util.Scanner;

public class Lottery {

	public static int[] arr, comb;
	public static int N;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {

			N = sc.nextInt();

			if (N == 0) {
				break;
			}

			arr = new int[N];
			comb = new int[N];

			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			DFS(0, 0);
			System.out.println();
		}
	}

	public static void DFS(int start, int depth) {
		if (depth == 6) {
			print();
		}
		for (int i = start; i < N; i++) {
			comb[i] = 1;
			DFS(i + 1, depth + 1);
			comb[i] = 0;
		}

	}

	public static void print() {
		for (int i = 0; i < N; i++) {
			if (comb[i] == 1)
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
