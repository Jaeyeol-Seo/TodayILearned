package bj_DivideAndConquer;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixSquare {
	
	public static int[][] b;
	public static int[][] c;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int len = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] arr = new int[len][len];
		
		for(int i = 0 ; i < len ; i++) {
			for(int j = 0 ; j < len ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		matrixPow(arr, n);
		
		System.out.println(sb);
	}
	
	public static void matrixPow(int[][] a, int n) {
		b = new int[a.length][a.length];
		c = Arrays.copyOf(a, a.length);
		int cnt = 1;
		
		while(cnt == n - 1) {
			for(int i = 0 ; i < a.length ; i++) {
				for(int j = 0 ; j < a.length ; j++) {
					for(int k = 0 ; k < a.length ; k++) {
						b[i][j] += ((c[i][k] * a[k][j]) % 1000);
					}
					sb.append(b[i][j] + " ");
				} sb.append(System.lineSeparator());
			}
			cnt++;
			c = Arrays.copyOf(b, b.length);
			Arrays.fill(b, 0);
		}
	}

}
