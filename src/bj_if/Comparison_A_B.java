package bj_if;

//BOJ 1330
import java.util.Scanner;

public class Comparison_A_B {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if ( a < b ) {
			System.out.println("<");
		} else System.out.println("==");
	}

}
