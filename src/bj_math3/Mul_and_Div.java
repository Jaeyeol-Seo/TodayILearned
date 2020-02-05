package bj_math3;

//BOJ 5086
import java.util.Scanner;

public class Mul_and_Div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if ( a > b) {
				if ( a % b == 0 ) {
					sb.append("multiple" + System.lineSeparator());
				} else sb.append("neither" + System.lineSeparator());
			}
			
			if ( a < b) {
				if ( b % a == 0 ) {
					sb.append("factor" + System.lineSeparator());
				} else sb.append("neither" + System.lineSeparator());
			}
			if ( a == 0 && b == 0) {
				break;
			}
			
		}
		System.out.println(sb);
		
	}

}
