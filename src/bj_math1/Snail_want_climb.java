package bj_math1;

// BOJ 2869
import java.util.Scanner;

public class Snail_want_climb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int climb = sc.nextInt();
		int down = sc.nextInt();
		int tree = sc.nextInt();
		
		int daylimit = climb - down;
		int lastday = tree - climb;
		
		int days = lastday / daylimit;
		
		if ( days * daylimit < lastday ) {
			System.out.println(days + 2);
		} else System.out.println(days + 1);
	}
}
