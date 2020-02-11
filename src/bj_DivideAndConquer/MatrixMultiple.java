package bj_DivideAndConquer;

//BOJ 2740
import java.util.Scanner;

public class MatrixMultiple {

	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int aheight = sc.nextInt();
		int awidth = sc.nextInt();
		
		int[][] a = new int[aheight][awidth];
		
		for ( int i = 0 ; i < aheight ; i++) {
			for ( int j = 0 ; j < awidth ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int bheight = sc.nextInt();
		int bwidth = sc.nextInt();
		
		int[][] b = new int[bheight][bwidth];
		
		for ( int i = 0 ; i < bheight ; i++) {
			for ( int j = 0 ; j < bwidth ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		int[][] c = new int[aheight][bwidth];
		
		matmultiple(a, b, c, aheight, bwidth, awidth);
		
		System.out.println(sb);
	}
	
	public static void matmultiple(int[][] a, int[][] b, int[][] c, int n, int m, int k) {
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				for(int x = 0 ; x < k ; x++) {
					c[i][j] += a[i][x] * b[x][j];
				}
				sb.append(c[i][j] + " ");
			}
			sb.append(System.lineSeparator());
		}
	}

}
