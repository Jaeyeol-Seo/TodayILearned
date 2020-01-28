package bj_math;

//BOJ 1977
import java.util.Scanner;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] sqrnum = new int[100];
		for(int i = 0 ; i < 100 ; i++) {
			sqrnum[i] = (i+1)*(i+1);
		}
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		int sqrmin = 10000;
		int sqrsum = 0;
		
		for (int i = min ; i <= max ; i++) {
			for(int j = 0 ; j < 100 ; j++) {
				if ( sqrnum[j] == i ) {
					sqrsum += i;
					if ( i < sqrmin ) {
						sqrmin = i;
					}
				}
			}
		}
		
		if ( sqrsum == 0 ) {
			System.out.println(-1);
		} else {
			System.out.println(sqrsum);
			System.out.println(sqrmin);
		}
		
	}

}
