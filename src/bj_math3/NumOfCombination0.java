package bj_math3;

//BOJ 2004
import java.util.Scanner;

public class NumOfCombination0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextInt();
		long b = sc.nextInt();
		long c = a - b;
		
		long five = fivecnt(a) - fivecnt(b) - fivecnt(c);
		long two = twocnt(a) - twocnt(b) - twocnt(c);
		
		System.out.println(five >= two ? five : two);
		
		
	}	
	public static long fivecnt(long a) {
		long cnt5 = 0;
		
		for (long i = 5; i <= a; i *= 5) {
			cnt5 += a / i;
		}
		
		return cnt5;
	}
	public static long twocnt(long a) {
		long cnt2 = 0;
		
		for (long i = 2; i <= a; i *= 2) {
			cnt2 += a / i;
		}
		
		return cnt2;
	}

}
