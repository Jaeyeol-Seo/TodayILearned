package bj_math3;

import java.util.Scanner;

public class Factorization {

	public static StringBuilder sb = new StringBuilder();
	public static int num;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();

		divide(num);

	}

	public static void divide(int num) {
		for (int i = 2; i < 10000000; i++) {
			if (num % i == 0) {
				num /= i;
				sb.append(i + System.lineSeparator());
				if (num == 1) {
					System.out.println(sb);
					System.exit(0);
				} else
					divide(num);
			}
		}
	}
}
