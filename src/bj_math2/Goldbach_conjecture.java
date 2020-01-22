package bj_math2;

// BOJ 9020
import java.util.Scanner;

public class Goldbach_conjecture {
	
	public static StringBuilder sb = new StringBuilder();
	public static boolean[] prime = new boolean[10001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		findPrime();
		
		int tcase = sc.nextInt();
		
		for ( int i = 0 ; i < tcase ; i++) {
			int n = sc.nextInt();
			
			for (int j = n / 2 ; j > 0 ; j--) {
				int x = j;
				int y = n - j;
				if ( !prime[x] && !prime[y]) {
					sb.append(x + " " + y);
					sb.append(System.lineSeparator());
					break;
				}
			}
		}
		System.out.println(sb);
	}
	
	public static void findPrime() {
		prime[1] = true; 
		for(int i = 2 ; i <= 10000 ; i++) {
			for(int j = 2; i*j <= 10000 ; j++) {
				prime[i*j] = true;
			}
		}
	}
}
