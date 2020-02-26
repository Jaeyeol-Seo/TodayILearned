package bj_DP;

//BOJ 9095
import java.util.Scanner;

public class Plus123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		int[] arr = new int[11];
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for(int i = 4 ; i < arr.length ; i++) {
			arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
		}
		
		for(int i = 0 ; i < tcase ; i++) {
			int n = sc.nextInt();
			System.out.println(arr[n]);
		}
	}

}
