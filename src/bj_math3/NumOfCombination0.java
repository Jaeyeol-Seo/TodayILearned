package bj_math3;

import java.math.BigInteger;
import java.util.Scanner;

public class NumOfCombination0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int cnt = 0;
		long combination = 1;
		
		for(int i = 0 ; i < b ; i++) {
			combination *= ((a - i) / ((b - i) * ((a - b) - i))); 
		}
		
		System.out.println(combination);
		
		String strcom = String.valueOf(combination);
		char[] arrstcom = strcom.toCharArray();
		for (int i = arrstcom.length - 1 ; i >= 0 ; i++) {
			if ( arrstcom[i] == '0') {
				cnt++;
			} else {
				System.out.println(cnt);
				return;
			}
		}
	}

}
