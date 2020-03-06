package bj_Search;

//BOJ 1543
import java.util.Scanner;

public class DocumentSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int cnt = 0;
		
		for(;s1.indexOf(s2) > -1 ; cnt++) { // indexOf의 사용법을 알았다.
			s1 = s1.substring(s1.indexOf(s2) + s2.length(), s1.length());
		}
		
		System.out.println(cnt);
	}

}
