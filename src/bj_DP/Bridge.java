package bj_DP;

//BOJ 1010
import java.math.BigInteger;
import java.util.Scanner;

public class Bridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while (T > 0) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			System.out.println(combination(N, M));
			
			--T;
		}
	}

	public static BigInteger combination(int r, int n) {
		BigInteger sum = new BigInteger("1");
		int temp = r;
		while (r > 0) {
			sum = sum.multiply(BigInteger.valueOf(n));
			--r;
			--n;
		}
		while (temp > 0) {
			sum = sum.divide(BigInteger.valueOf(temp));
			--temp;
		}
		return sum;
	}

}
