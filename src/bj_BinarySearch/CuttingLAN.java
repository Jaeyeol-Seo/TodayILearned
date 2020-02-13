package bj_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CuttingLAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int linenum = sc.nextInt();
		
		int n = sc.nextInt();
		
		long[] lanlen = new long[linenum];
		
		for(int i = 0 ; i < linenum ; i++) {
			lanlen[i] = sc.nextLong();
		}
		
		Arrays.sort(lanlen);
		
		long maxlen = lanlen[linenum - 1];
		long minlen = 1;
		long middle = 0;
		
		while ( minlen <= maxlen ) {
			int cnt = 0;
			
			middle = (maxlen + minlen) / 2;
			
			for(int i = 0 ; i < lanlen.length ; i++) {
				cnt += lanlen[i] / middle;
			}
			
			if ( cnt >= n ) {
				minlen = middle + 1;
			} else if ( cnt < n ) {
				maxlen = middle - 1;
			}
		}
		
		System.out.println(maxlen);
	}

}
