package bj_DivideAndConquer;

//BOJ 2630
import java.util.Scanner;

public class MakeColorPaper {

	public static int[] color;
	public static int blue = 0;
	public static int white = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		solve(arr);
		
		System.out.println(white);
		System.out.println(blue);
		
	}
	
	public static void solve(int[][] arr) {
		if ( checkPaper(arr)) {
			return;
		} else {
			int half = arr.length / 2;
			
			solve(cutPaper(arr, 0, 0, half, half)); // 1锅 备开
			solve(cutPaper(arr, half, 0, arr.length, half)); // 2锅 备开
			solve(cutPaper(arr, 0, half, half, arr.length)); // 3锅 备开
			solve(cutPaper(arr, half, half, arr.length, arr.length)); // 4锅 备开
		}
	}
	
	public static int[][] cutPaper(int[][] arr, int x1, int y1, int x2, int y2) {
		int[][] temp = new int[arr.length / 2][arr.length / 2];
		
		int tx = 0;
		int ty = 0;
		
		for(int i = x1 ; i < x2 ; i++) {
			for(int j = y1 ; j < y2 ; j++) {
				temp[tx][ty++] = arr[i][j]; 
			}
			tx++;
			ty = 0;
		}
		
		return temp;
	}
	
	public static boolean checkPaper(int[][] arr) {
		color = new int[2];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for (int j = 0 ; j < arr.length ; j++) {
				color[arr[i][j]]++;
			}
		}
		
		if ( color[0] > 0 && color[1] > 0) {
			return false;
		} else {
			if ( color[0] == 0 && color[1] > 0) {
				blue++;
			} else white++;
			return true;
		}
	}

}
