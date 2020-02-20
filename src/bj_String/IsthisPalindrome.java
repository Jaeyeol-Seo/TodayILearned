package bj_String;

//BOJ 10988
import java.util.Scanner;

public class IsthisPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		int mid = s.length() / 2;
		
		if ( s.length() % 2 != 0 ) {
			for(int i = 1 ; i <= mid ; i++) {
				if(s.charAt(mid - i) != s.charAt(mid + i)) {
					System.out.println(0);
					return;
				}
			}
		} else {
			for(int i = 0 ; i < mid ; i++) {
				if(s.charAt(mid + i) != s.charAt(mid - (1 + i))) {
					System.out.println(0);
					return;
				}
			}
		}
		
		System.out.println(1);
	}

}
