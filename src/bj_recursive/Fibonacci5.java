package bj_recursive;

import java.util.Scanner;

public class Fibonacci5 {

	public static int fibo(int n) { // ���� ���� �Ǻ���ġ ���
		if (n <= 1) {
			return n;

		} else return fibo(n - 2) + fibo(n - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibo(n));
	}

}
