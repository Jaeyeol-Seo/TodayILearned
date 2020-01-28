package bj_bruteforce;

//BOJ 1436
import java.util.Scanner;

public class Moviedirector_shom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int seriesnum = sc.nextInt();

		int cnt = 0;

		for (int i = 1; i <= 10000000; i++) {
			String stri = String.valueOf(i);
			if (stri.contains("666")) {
				cnt++;
			}

			if (cnt == seriesnum) {
				System.out.println(i);
				return;
			}
		}
	}
}
