package bj_BFS;

//BOJ 2178
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindMaze {

	public static boolean[][] check;
	public static int[][] maze;
	public static int height, width;

	public static int[] directionX = { -1, 0, 1, 0 }; // X + Y => 좌, 상, 우, 하
	public static int[] directionY = { 0, -1, 0, 1 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		height = sc.nextInt();
		width = sc.nextInt();

		maze = new int[height][width];
		check = new boolean[height][width];
		
		for (int i = 0; i < height; i++) {
			String s = sc.next();
			for (int j = 0; j < width; j++) {
				maze[i][j] = (int) s.charAt(j) - 48;
				check[i][j] = false;
			}
		}

		check[0][0] = true;
		bfs(0, 0);
		System.out.println(maze[height - 1][width - 1]);
	}

	public static void bfs(int startx, int starty) {
		Queue<Node> q = new LinkedList<Node>();

		q.offer(new Node(startx, starty));

		while (!q.isEmpty()) {
			Node node = q.poll();

			for (int i = 0; i < 4; i++) {
				int nextX = node.x + directionX[i];
				int nextY = node.y + directionY[i];

				if (nextX < 0 || nextY < 0 || nextX >= height || nextY >= width) {
					continue;
				} // 배열 범위 초과하는 경우 예외 처리

				if (check[nextX][nextY] == true || maze[nextX][nextY] == 0) {
					continue;
				} // 이미 들린 곳이거나 벽인 경우 예외 처리

				q.offer(new Node(nextX, nextY));
				maze[nextX][nextY] = maze[node.x][node.y] + 1;
				check[nextX][nextY] = true;
			}
		}
	}

}

class Node { // 미로 찾기는 노드 객체를 쓰자...
	int x, y;

	Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
