package bj_math1;

//BOJ 1193
import java.util.Scanner;

public class FindDivider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int line = 0;
		int cnt = 0;
		while (cnt < n) {
			line++;
			cnt = line * (line + 1) / 2;
		}
		if (line % 2 != 0) {
			int top = 1 + (cnt - n);
			int bottom = line - (cnt - n);
			System.out.println(top + "/" + bottom);
		} else {
			int top = line - (cnt - n);
			int bottom = 1 + (cnt - n);
			System.out.println(top + "/" + bottom);
		}

	}

}
