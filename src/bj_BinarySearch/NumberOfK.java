package bj_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class NumberOfK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int j = 0;
		
		while((k - j) % n != 0) {
			j++;
		}
		
		int i = (k - j) / n ;
		
		System.out.println((i + 1) * (j + 1));
		
	}

}
