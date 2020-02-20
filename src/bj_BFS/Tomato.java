package bj_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {

	public static int height, width;
	public static int[][] tomato;
	public static boolean[][] check;
	
	public static int[] directionX = {0, 0, -1, 1};
	public static int[] directionY = {-1, 1, 0, 0};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		width = sc.nextInt();
		height = sc.nextInt();
		
		tomato = new int[height + 1][width + 1];
		check = new boolean[height + 1][width + 1];
		
		for(int i = 0 ; i < height ; i++) {
			for(int j = 0 ; j < width ; j++) {
				tomato[i][j] = sc.nextInt();
			}
		}
		
		bfs();

	}
	
	public static void bfs() {
		Queue<Seed> q = new LinkedList<>();
		
		for(int i = 0 ; i < height ; i++) {
			for(int j = 0 ; j < width ; j++) {
				if(tomato[i][j] == 1) {
					q.offer(new Seed(i, j));
				}
			}
		}
		
		while(!q.isEmpty()) {
			Seed s = q.poll();
			for(int i = 0 ; i < 4 ; i++) {
				int nextX = s.x + directionX[i];
				int nextY = s.y + directionY[i];
				
				//���� �� �н�
                if (nextX < 0 || nextY < 0 || nextX >= height || nextY >= width) {
                    continue;
                }
                //���� ��ġ�� ���� ���� �丶�䰡 �ƴϸ� �н�
                if (tomato[nextX][nextY] != 0) {
                    continue;
                }
                //�ִ� �ϼ��� ���ϱ� ������ 1�� �ٲٴ� ���� �ƴ϶� ���� �ϼ� +1 �� ������Ѵ�.
                tomato[nextX][nextY] = tomato[s.x][s.y] + 1;
                q.add(new Seed(nextX, nextY));
			}
		}
		
		int max = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (tomato[i][j] == 0) {
                    //�丶�䰡 ��� ���� ���� ��Ȳ�̶�� -1 �� ����Ѵ�.
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, tomato[i][j]);
            }
        }
        //�׷��� �ʴٸ� �ִ밪�� ����Ѵ�.
        System.out.println(max - 1);
	}

}

class Seed {
	int x, y;
	Seed(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
