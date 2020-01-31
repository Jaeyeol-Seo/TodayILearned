package bj_backtracking;

//BOJ 15651
import java.util.Scanner;

public class N_and_M_3 {

	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static boolean[] visited;
	public static int lastnum, length;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		lastnum = sc.nextInt();
		length = sc.nextInt();

		arr = new int[length];
		visited = new boolean[lastnum + 1];

		backtracking(0, 0);

		System.out.println(sb);

	}

	public static void backtracking(int index, int start) {
		if (start == length) {
			for (int i : arr) {
				sb.append(i + " ");
			}
			sb.append(System.lineSeparator());
			return;
		}
		for (int i = 1 ; i <= lastnum; i++) {
			if (!visited[i]) {
//				visited[i] = true;
				arr[start] = i;
				backtracking(i, start + 1);
				visited[i] = false;
			}
		}
		return;
	}

}
