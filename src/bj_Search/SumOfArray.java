package bj_Search;

//BOJ 1024
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int L = sc.nextInt();
		
		int[] ans;
		
		for(int i = L ; i <= 100 ; i++) {
			if ( i % 2 == 0 ) {
				int mid = N / i;
				
				if ( (mid * i) + (i / 2) == N && mid - (i / 2 - 1) >= 0) {
					ans = new int[i];
					
					for(int j = 0 ; j < i ; j++) {
						ans[j] = mid + j - (i / 2 - 1);

						System.out.print(ans[j] + " ");
					}
					return;
				} else continue;
			} else {
				int mid = N / i;
				
				if ( mid * i == N && mid - (i / 2) >= 0) {
					ans = new int[i];
					
					for(int j = 0 ; j < i ; j++) {
						ans[j] = mid + j - (i / 2);
					
						System.out.print(ans[j] + " ");
					}
					return;
				} else continue;
			}
		}
		
		System.out.println(-1);
	}

}
