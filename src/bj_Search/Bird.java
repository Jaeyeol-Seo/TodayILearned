package bj_Search;

//BOJ 1568
import java.util.Scanner;

public class Bird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int val = 1;
		int cnt = 0;
		
		while(N > 0) {
			if(N < val) {
				val = 1;
			}
			N = N - val;
			
			val++;
			cnt++;
		}
		
		System.out.println(cnt);
	}

}
