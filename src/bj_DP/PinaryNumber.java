package bj_DP;

//BOJ 2193
import java.util.Scanner;

public class PinaryNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long[] arr = new long[91];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i = 3; i < arr.length ; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		System.out.println(arr[sc.nextInt()]);
	}

}
