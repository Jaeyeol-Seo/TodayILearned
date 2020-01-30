package bj_backtracking;

//BOJ 15649
import java.util.Scanner;

public class N_and_M_1 {

	public static StringBuilder sb = new StringBuilder();
	public static int[] arr;
	public static boolean[] visit;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int lastnum = sc.nextInt();
		int length = sc.nextInt();
		
		arr = new int[length];
		visit = new boolean[lastnum + 1];
		
		dfs(lastnum, length, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int lastnum, int length, int start) {
		if(start == length) {
			for(int a : arr) sb.append(a + " ");
			sb.append("\n");
			return;
		}
		
		for(int i = 1; i <= lastnum; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[start] = i;
				dfs(lastnum, length, start + 1);
				visit[i] = false;
			}
		}
		return;
		
	}

}
