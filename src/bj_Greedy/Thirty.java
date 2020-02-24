package bj_Greedy;

//BOJ 10610
import java.util.Arrays;
import java.util.Scanner;

public class Thirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		if (!s.contains("0")) {
			System.out.println(-1);
			return;
		} else {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			
			int temp = 0;
			
			for(int i = 0 ; i < arr.length ; i++) {
				temp += arr[i] - '0';
			}
			
			if ( temp % 3 != 0 ) {
				System.out.println(-1);
				return;
			} else {
				for(int i = arr.length - 1 ; i >= 0 ; i--) {
					System.out.print(arr[i]);
				}
				return;
			}
		}
	}

}
