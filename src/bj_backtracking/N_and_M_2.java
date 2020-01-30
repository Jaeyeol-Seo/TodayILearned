package bj_backtracking;

//BOJ 15650
import java.util.Scanner;

public class N_and_M_2 {

	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static boolean[] visited;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int lastnum = sc.nextInt();
		int length = sc.nextInt();

		arr = new int[length];
		visited = new boolean[lastnum + 1];

		backtracking(lastnum, length, 0);

		System.out.println(sb);

	}

	public static void backtracking(int lastnum, int length, int start) {
		if (start == length) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append(System.lineSeparator());
			return;
		}
		for (int i = 1; i <= lastnum; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[start] = i;
				backtracking(lastnum, length, start + 1);
				visited[i] = false;
			}
		}
		return;
	}

}
