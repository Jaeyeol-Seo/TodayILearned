package bj_DFS;

//BOJ 1987
import java.util.Scanner;

public class Alphabet {

	public static int N, M;
	public static char[][] arr;
	public static int[] check;
	public static boolean[][] visited;
	
	public static int[] nextX = {0, 0, -1, 1};
	public static int[] nextY = {-1, 1, 0, 0};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new char[N][M];
		visited = new boolean[N][M];
		
		for(int i = 0 ; i < N ; i++) {
			String s = sc.next();
			for(int j = 0 ; j < M ; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		
		check = new int[26];
		
		visited[0][0] = true;
		check[(int) arr[0][0] - 'A'] = 1;
		System.out.println(solve(0, 0));
		
	}
	
	public static int solve(int y, int x) {
		
		int max = 0;
		
		for(int i = 0 ; i < 4 ; i++) {
			int nx = x + nextX[i];
			int ny = y + nextY[i];
			
			if(nx < 0 || nx >= M || ny < 0 || ny >= N) {
				continue;
			}
			
			if(check[(int) arr[ny][nx] - 'A'] == 1) {
				continue;
			}
			
			visited[ny][nx] = true;
			check[(int) arr[ny][nx] - 'A'] = 1;
			max = Math.max(max, solve(ny, nx));
			visited[ny][nx] = false;
		}
		
		check[(int) arr[y][x] - 'A'] = 0;
		
		return max + 1;
	}

}
