package bj_Stack;

//BOJ 4949
import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Character> st = new Stack<>();

		while (true) {
			st.clear();
			
			String str = sc.nextLine();

			char[] chstr = str.toCharArray();

			if (chstr[0] == '.') {
				break;
			}

			for (int i = 0; i < chstr.length; i++) {
				if (chstr[i] == '(' || chstr[i] == '[') {
					st.push(chstr[i]);
				} else if (chstr[i] == ')') {
					if (st.isEmpty()) {
						st.push(chstr[i]);
						break;
					} else if (st.peek() != '(') {
						st.push(chstr[i]);
						break;

					}
					st.pop();
				} else if (chstr[i] == ']') {
					if (st.isEmpty()) {
						st.push(chstr[i]);
						break;
					} else if (st.peek() != '[') {
						st.push(chstr[i]);
						break;

					}
					st.pop();
				}
			}

			if (st.isEmpty()) {
				sb.append("yes" + System.lineSeparator());
			} else
				sb.append("no" + System.lineSeparator());

		}

		System.out.println(sb);
	}

}
