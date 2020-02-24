package bj_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class CharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		if (s1.length() == s2.length()) {
			int diff = 0;
			
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					diff++;
				}
			}
			System.out.println(diff);
			return;
		} else {
			int len = s2.length() - s1.length();
			
			int[] diff = new int[len + 1];
			
			for(int i = 0 ; i <= len ; i++) {
				for(int j = 0 ; j < s1.length() ; j++) {
					if ( s1.charAt(j) != s2.charAt(j + i)) {
						diff[i]++;
					}
				}
			}
			Arrays.sort(diff);
			
			System.out.println(diff[0]);
		}
	}

}
