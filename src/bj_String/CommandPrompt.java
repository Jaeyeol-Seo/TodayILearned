package bj_String;

//BOJ 1032
import java.util.Scanner;

public class CommandPrompt {
	
	public static StringBuilder sb;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String pattern = null;
		
		if( n == 1 ) {
			System.out.println(sc.next());
			return;
		}
		
		for(int i = 0 ; i < n ; i++) {
			String s = sc.next();
			if ( pattern == null ) {
				pattern = s;
			} else pattern = findPattern(s, pattern);
		}
		
		System.out.println(sb);
	}
	
	public static String findPattern(String s1, String s2) {
		sb = new StringBuilder();
		
		for(int i = 0 ; i < s1.length(); i++) {
			if(s1.charAt(i) == s2.charAt(i)) {
				sb.append(s1.charAt(i));
			} else sb.append("?");
		}
		
		return sb.toString();
	}

}
