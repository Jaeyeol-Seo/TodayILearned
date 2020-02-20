package bj_BFS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ApartmentNumber {

	public static int N;
	public static int[][] apartment;
	public static boolean[][] check;
	public static int[] directionX = { 0, 0, -1, 1 }; // X + Y = ╩С го аб ©Л
	public static int[] directionY = { -1, 1, 0, 0 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		apartment = new int[N + 1][N + 1];
		check = new boolean[N + 1][N + 1];

		for (int i = 0; i < N; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				apartment[i][j] = (int) s.charAt(j) - 48;
				check[i][j] = false;
			}
		}
		
		bfs();
	}

	public static void bfs() {
		Queue<Apartment> list = new LinkedList<>();
		ArrayList<Integer> cnt = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			int x, y;
			int nextX, nextY;
			int apartmentCnt;
			for (int j = 0; j < N; j++) {
				apartmentCnt = 1;
				if (apartment[i][j] == 1) {
					x = i;
					y = j;
					list.add(new Apartment(x, y));
					check[i][j] = true;
					while (!list.isEmpty()) {
						Apartment a = list.poll();
						x = a.x;
						y = a.y;
						for (int k = 0; k < 4; k++) {
							nextX = x + directionX[k];
							nextY = y + directionY[k];
							if (nextX >= 0 && nextX < N && nextY < N && nextY >= 0) {
								if (apartment[nextX][nextY] == 1 && check[nextX][nextY] == false) {
									apartmentCnt++;
									list.offer(new Apartment(nextX, nextY));
									apartment[nextX][nextY] = 0;	
								}
								check[nextX][nextY] = true;
							}
						}
					}
					cnt.add(apartmentCnt);
				}
			}
		}
		Collections.sort(cnt);
		Iterator<Integer> it = cnt.iterator();
		System.out.println(cnt.size());
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}

class Apartment {
	int x, y;

	Apartment(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
