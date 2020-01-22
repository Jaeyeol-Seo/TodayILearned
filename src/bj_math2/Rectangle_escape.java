package bj_math2;

//BOJ 1085
import java.util.Scanner;

public class Rectangle_escape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int horizon = Math.min(Math.abs(0 - x), Math.abs(w - x));
		int vertical = Math.min(Math.abs(0 - y), Math.abs(h - y));
		
		int minimum = Math.min(horizon, vertical);
		
		System.out.println(minimum);
	}

}
