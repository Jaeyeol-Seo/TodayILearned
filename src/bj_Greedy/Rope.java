package bj_Greedy;

//BOJ 2217
import java.util.Arrays;
import java.util.Scanner;

public class Rope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] rope = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			rope[i] = sc.nextInt();
		}
		
		Arrays.sort(rope);
		
		long maxweight = 0;
		
		for(int i = rope.length - 1; i >= 0 ; i--) {
			rope[i] = rope[i] * (n - i);
			if ( maxweight < rope[i] ) {
				maxweight = rope[i];
			}
		}
		
		System.out.println(maxweight);
	}

}
