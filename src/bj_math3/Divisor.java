package bj_math3;

//BOJ 1037
import java.util.Arrays;
import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int divisornum = sc.nextInt();
		
		int[] divisor = new int[divisornum];
		
		for(int i = 0 ; i < divisornum ; i++) {
			divisor[i] = sc.nextInt();
		}
		
		Arrays.sort(divisor);
		
		System.out.println(divisor[0] * divisor[divisornum - 1]);
	}

}
