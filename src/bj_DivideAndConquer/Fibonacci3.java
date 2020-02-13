package bj_DivideAndConquer;

//BOJ 2749
import java.util.Scanner;

public class Fibonacci3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		
		int pisano = 1500000; // k = 10^n 이면 피사노 주기는 15*10^(n-1)
		
		long[] fibo = new long[pisano];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for ( int i = 2 ; i < pisano ; i++) {
			if ( i > n ) {
				break;
			}
			fibo[i] = fibo[i - 1] + fibo[i - 2];
			fibo[i] %= 1000000;
			
			
		}
		
		if ( n >= pisano) {
			n %= pisano;
		}
		
		System.out.println(fibo[(int) n]);
	}

}
