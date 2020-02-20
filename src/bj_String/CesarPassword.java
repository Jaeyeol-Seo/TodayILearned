package bj_String;

//BOJ 5598
import java.util.Scanner;

public class CesarPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i = 0 ; i < s.length() ; i++) {
			System.out.print(s.charAt(i) - 3 < 65 ? (char) (s.charAt(i) + 23) : (char) (s.charAt(i) - 3));
		}
	}
}
