package bj_bruteforce;

import java.util.Scanner;

public class Repaint_chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int width = sc.nextInt();
		
		char[][] arr = new char[height][width];
		char[][] arr1 = new char[8][8];
		char[][] arr2 = new char[8][8];

		int diffx = height - 8;
		int diffy = width - 8;
		
		String[] row = new String[height];

		for (int i = 0; i < row.length; i++) {
			row[i] = sc.next();
			for(int j = 0 ; j < width ; j++) {
				arr[i][j] = row[i].charAt(j);
			}
		}

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					arr1[i][j] = 'B';
					arr2[i][j] = 'W';
				} else {
					arr1[i][j] = 'W';
					arr2[i][j] = 'B';
				}
			}
		}
		int min = 64;
		
		for(int i = 0 ; i < height ; i++) {
			for(int j = 0 ; j < width ; j++) {
				int cnt1 = 0;
				int cnt2 = 0;
				for(int k = 0 ; k < diffx ; k++) {
					for(int m = 0 ; m < diffy ; m++) {
						if(arr[i + k][j + m] != arr1[i][j]) {
							cnt1++;
						}
						if(arr[i + k][j + m] != arr2[i][j]) {
							cnt2++;
						}
					}
				}
				min = Math.min(cnt1, cnt2);
			}
		}
		

	}

}
