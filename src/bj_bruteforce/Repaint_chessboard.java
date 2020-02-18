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

		String[] row = new String[height];

		for (int i = 0; i < row.length; i++) {
			row[i] = sc.next();
			for (int j = 0; j < width; j++) {
				arr[i][j] = row[i].charAt(j);
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
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
		
		for (int i = 0; i < height - 7; i++) { // 4중 for문 에바인데;;
			for (int j = 0; j < width - 7; j++) {
				int diff1 = 0;
				int diff2 = 0;
				for (int m = 0; m < 8; m++) {
					for (int n = 0; n < 8; n++) {
						if (arr[m + i][n + j] != arr1[m][n]) {
							diff1++;
						}
						if (arr[m + i][n + j] != arr2[m][n]) {
							diff2++;
						}
					}
				}
				int temp = Math.min(diff1, diff2);
				min = Math.min(temp, min);
			}
		}
		
		System.out.println(min);
	}

}
