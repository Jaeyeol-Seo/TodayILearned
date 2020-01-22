package bj_math2;

//BOJ 4153
import java.util.Scanner;

public class Right_angled_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (a == 0 && b == 0 && c == 0) {
				break;
			}
			if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
				System.out.println("right");
				continue;
			} else {
				System.out.println("wrong");
				continue;
			}
		}
	}

}
