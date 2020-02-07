package bj_Stack;

//BOJ 1874
import java.util.Scanner;
import java.util.Stack;

public class StackArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Stack<Integer> st = new Stack<>();

		int tcase = sc.nextInt();

		int[] arr = new int[tcase];

		for (int i = 0; i < tcase; i++) {
			arr[i] = sc.nextInt();
		}

		int idx = 0;

		for (int i = 1; i <= tcase; i++) {
			st.push(i);
			sb.append("+" + System.lineSeparator());
			while (!st.isEmpty() && st.peek() == arr[idx]) {
				st.pop();
				sb.append("-" + System.lineSeparator());
				idx++;
			}
		}
		
		if ( st.isEmpty() ) {
			System.out.println(sb);			
		} else System.out.println("NO");
		sc.close();
	}

}
