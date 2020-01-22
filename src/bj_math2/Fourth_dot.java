package bj_math2;

//BOJ 3009
import java.util.Scanner;

public class Fourth_dot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] x = new int[1001];
		int[] y = new int[1001];
		
		for ( int i = 0 ; i < 3 ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			x[a]++;
			y[b]++;
		}
		
		int findx = 0;
		int findy = 0;
		
		for ( int i = 1 ; i < 1001 ; i++) {
			if ( x[i] == 1 ) {
				findx = i;
			}
			if ( y[i] == 1 ) {
				findy = i;
			}
		}
		System.out.println(findx + " " + findy);

	}

}
