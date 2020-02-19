package bj_String;

import java.util.Arrays;
import java.util.Scanner;

public class DontSeeDontListen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int listen = sc.nextInt();
		int see = sc.nextInt();
		
		int cnt = 0;
		
		String[] dontlisten = new String[listen];
		String[] dontsee = new String[see];
		for(int i = 0 ; i < listen ; i++) { 
			dontlisten[i] = sc.next();
		}
		
		for(int i = 0 ; i < see ; i++) {
			dontsee[i] = sc.next();
		}
		
		Arrays.sort(dontsee);
		
		for(String j : dontlisten) {
			if ( j.equals(dontsee)) {
				sb.append(dontsee + System.lineSeparator());
				cnt++;
			}
		}
		System.out.println(cnt);
		System.out.println(sb);
	}

}
