package bj_String;

//BOJ 2902
import java.util.Scanner;

public class WhyKMPisKMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if((int)s.charAt(i) >= 65 && (int)s.charAt(i) < 97) {
				System.out.print(s.charAt(i));
			}
		}
	}

}
