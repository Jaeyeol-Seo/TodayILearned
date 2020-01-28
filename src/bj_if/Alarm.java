package bj_if;

//BOJ 2884
import java.util.Scanner;

public class Alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if ( min < 45 ) {
			if ( hour == 0 ) {
				System.out.println((hour + 23) + " " + (min + 15));
			} else System.out.println((hour - 1) + " " + (min + 15));
		} else System.out.println(hour + " " + (min - 45));
	}

}
