package bj_for;

//BOJ 11021
import java.util.Scanner;

public class A_plus_B_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		for ( int i = 1 ; i <= tcase ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Case #" + i + ": " + (a + b));
		}
	}

}
