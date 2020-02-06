package bj_Stack;

//BOJ 10773
import java.util.Scanner;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0 ; i < tcase ; i++) {
			int n = sc.nextInt();
			if ( n != 0) {
				st.push(n);
			} else st.pop();
		}
		
		int sum = 0;
		
		for ( int i : st) {
			sum += i; 
		}
		
		System.out.println(sum);
	}

}
