package bj_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();
		
		while(true) {
			String str = sc.nextLine();
			
			char[] chstr = str.toCharArray();
			
			int cnt = 0;
			
			if(chstr[0] == '.') {
				break;
			}
			
			for(int i = 0 ; i < chstr.length; i++) {
				if ( chstr[i] == '(') {
					st.push(chstr[i]);
					cnt += 1;
				} else if (chstr[i] == '[') {
					st.push(chstr[i]);
					cnt += 2;
				} else if (chstr[i] == ')') {
					if (st.peek() == '[') {
						sb.append("no" + System.lineSeparator());
						break;
					}
					st.push(chstr[i]);
					cnt -= 1;
					if (cnt < 0) {
						sb.append("no" + System.lineSeparator());
						break;
					}
				} else if (chstr[i] == ']') {
					if (st.peek() == '(') {
						sb.append("no" + System.lineSeparator());
						break;
					}
					st.push(chstr[i]);
					cnt -= 2;
					if (cnt < 0) {
						sb.append("no" + System.lineSeparator());
						break;
					}
				} else if (chstr[i] == '.') {
					if ( cnt == 0 ) {
						sb.append("yes" + System.lineSeparator());
						break;
					} else sb.append("no" + System.lineSeparator()); break;
				}
			}
	
		}
				
		System.out.println(sb);
	}

}
