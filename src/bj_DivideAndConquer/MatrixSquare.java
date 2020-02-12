package bj_DivideAndConquer;

import java.util.Scanner;

public class MatrixSquare {

	public static long[][] arr;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int len = sc.nextInt();
		long n = sc.nextLong();

		arr = new long[len][len];

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				arr[i][j] = sc.nextLong();
			}
		}

		long[][] ans = matrixPow(n);

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static long[][] matrixPow(long n) {
		long[][] result = new long[arr.length][arr.length];
		long[][] temp = new long[arr.length][arr.length];

		if (n == 1) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					temp[i][j] = arr[i][j] % 1000;
				}
			}
			return temp;

		} else if (n % 2 == 0) {
			temp = matrixPow(n / 2);

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					for (int k = 0; k < arr.length; k++) {
						result[i][j] += temp[i][k] * temp[k][j];
					}
					result[i][j] %= 1000;
				}
			}

			return result;
		} else {
			temp = matrixPow(n - 1);
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					for (int k = 0; k < arr.length; k++) {
						result[i][j] += temp[i][k] * arr[k][j];
					}
					result[i][j] %= 1000;
				}
			}
			return result;

		}
	}

}
