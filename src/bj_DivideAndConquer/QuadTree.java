package bj_DivideAndConquer;

//BOJ 1992
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {

	public static int[] pixel;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			String s = br.readLine();
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = (int)s.charAt(j) - 48;
			}
		}
		
		solve(arr);
		
		System.out.println(sb);
		
	}
	
	public static void solve(int[][] arr) {
		if ( check(arr) ) {
			return;
		}
		
		int half = arr.length / 2;
		
		sb.append("(");
		solve(divide(arr, 0, 0, half, half));
		solve(divide(arr, 0, half, half, arr.length));
		solve(divide(arr, half, 0, arr.length, half));
		solve(divide(arr, half, half, arr.length, arr.length));
		sb.append(")");
	}
	
	public static int[][] divide(int[][] arr, int x1, int y1, int x2, int y2){
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
	
	public static boolean check(int[][] arr) {
		pixel = new int[2];
		
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr.length ; j++) {
				pixel[arr[i][j]]++;
			}
		}
		
		if ( pixel[0] > 0 && pixel[1] > 0) {
			return false;
		} else {
			if ( pixel[0] == 0 && pixel[1] > 0) {
				sb.append("1");
			} else sb.append("0");
			
			return true;
		}
	}

}
