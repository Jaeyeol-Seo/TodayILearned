package bj_DP1;

//BOJ 1003
import java.util.Scanner;

public class Fibonacci_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int tcase = sc.nextInt();
		
		int[][] fibo = new int[41][2];
		
		fibo[0][0] = 1;
		fibo[0][1] = 0;
		fibo[1][0] = 0;
		fibo[1][1] = 1;
		
		for(int i = 2; i < 41 ; i++) {
			fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0];
			fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1];
		}
		
		for(int i = 0 ; i < tcase ; i++) {
			int num = sc.nextInt();
			sb.append(fibo[num][0] + " " + fibo[num][1] + System.lineSeparator());
		}
		
		System.out.println(sb);
	}
}
