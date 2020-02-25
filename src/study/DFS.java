package study;

import java.util.ArrayList;

public class DFS {
	
	public static ArrayList<Integer>[] list;
	public static boolean[] check;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;
		
		list = new ArrayList[n + 1];
		check = new boolean[n + 1];
		
		for(int i = 1 ; i < n + 1 ; i++) {
			list[i] = new ArrayList<>();
		}
		
		list[1].add(2);
		list[1].add(3);
		list[2].add(1);
		list[2].add(3);
		list[2].add(4);
		list[2].add(5);
		list[3].add(1);
		list[3].add(2);
		list[3].add(6);
		list[3].add(7);
		list[4].add(2);
		list[4].add(5);
		list[5].add(2);
		list[5].add(4);
		list[6].add(3);
		list[6].add(7);
		list[7].add(3);
		list[7].add(6);
		
		dfs(1);
	}
	public static void dfs(int a) {
		if (check[a] == true) {
			return;
		}

		check[a] = true;
		System.out.print(a + " ");
		
		for (int b : list[a]) {
			if (check[b] != true) {
				dfs(b);				
			}
		}
	}
}
