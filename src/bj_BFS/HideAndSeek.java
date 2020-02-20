package bj_BFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek {

	public static int[] horizon;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int subin = sc.nextInt();
		int brother = sc.nextInt();

		horizon = new int[100001];

		Arrays.fill(horizon, 0);

		bfs(subin, brother);

	}

	public static void bfs(int x, int y) {
		Queue<Integer> q = new LinkedList<>();
		q.add(x);

		horizon[x] = 1;

		if (x == y) { // 같으면 그냥 바로 리턴
			System.out.println(horizon[x] - 1);
			return;
		}
		
		// 내일은 토마토 DFS 보자
		// 내일은 토마토 DFS 보자
		// 내일은 토마토 DFS 보자

		while (!q.isEmpty()) {
			x = q.poll();
			int[] direction = { 1, -1, x }; // 이동 방향
			for (int i = 0; i < direction.length; i++) {
				int nextX = x + direction[i];

				if (nextX < 0 || nextX > 100000) { // 범위 초과 예외처리
					continue;
				}
				if (horizon[nextX] != 0) { // 이미 들린 곳 예외처리
					continue;
				}
				q.offer(nextX);
				horizon[nextX] = horizon[x] + 1;
			}
		}
		System.out.println(horizon[y] - 1);
	}

}
