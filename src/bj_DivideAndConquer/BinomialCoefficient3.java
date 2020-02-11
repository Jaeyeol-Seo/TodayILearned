package bj_DivideAndConquer;

//BOJ 11401
import java.util.Scanner;

public class BinomialCoefficient3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long p = 1000000007;

		long[] factorial = new long[N + 1];
		factorial[0] = 1;
		factorial[1] = 1;
		// factorial 구하기
		for (int i = 2; i <= N; i++)
			factorial[i] = (factorial[i - 1] * i) % p;
		long denominator = (factorial[K] * factorial[N - K]) % p;

		
		// 페르마의 소정리가 뭔디...
		// fermatNum(denominator의 K-2 제곱 구하기)
		long index = p - 2;
		long fermatNum = 1;
		while (index > 0) {
			if (index % 2 == 1) {
				fermatNum *= denominator;
				fermatNum %= p;
			}
			denominator = (denominator * denominator) % p;
			index /= 2;
		}
		long result = ((factorial[N] % p) * (fermatNum % p)) % p;
		System.out.print(result);
	}
}
