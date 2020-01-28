package bj_Array;

//BOJ 10818
import java.util.Scanner;

public class Min_and_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		int min = 1000001;
		int max = -1000001;
		
		for(int i = 0 ; i < length ; i++) {
			arr[i] = sc.nextInt();
			if ( arr[i] < min ) {
				min = arr[i];
			}
			if ( arr[i] > max ) {
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
