package bj_Array;

//BOJ 3052
import java.util.Scanner;
import java.util.Arrays;

public class Rest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		int cnt = 1;
		
		for ( int i = 0 ; i < 10 ; i++) {
			arr[i] = sc.nextInt();
			arr[i] = arr[i] % 42;
		}
		
		Arrays.sort(arr);
		
		for ( int i = 0 ; i < 9 ; i++) {
			if ( arr[i] != arr[i + 1]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}

}
