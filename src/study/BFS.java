package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public static int n = 7;
	public static boolean[] isVisited = new boolean[n + 1];
	public static ArrayList<Integer>[] list;

	// 최단 경로 구할 때 주로 사용 **미로찾기 등
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list = new ArrayList[n + 1];
		
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
		
		bfs(1);
	}

	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(start);
		isVisited[start] = true;

		while (!q.isEmpty()) {
			int x = q.poll();
			System.out.print(x + " ");
			for (int y : list[x]) {
				if (isVisited[y] != true) {
					isVisited[y] = true;
					q.add(y);
				}
			}
		}
	}

}
