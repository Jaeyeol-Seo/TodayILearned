package study;

import java.util.Scanner;

public class KMPAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String target = "ababacabacaabacaaba";
		String pattern = "abacaaba";
		
		doKMP(target, pattern);
		
		int[] arr = getPi(pattern);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		
	}
	
	public static int[] getPi(String s) { // 실패함수 구현
		int size = s.length();
		
		char[] pattern = s.toCharArray();
		int[] Pi = new int[size];
		int j = 0;
		
		for(int i = 1 ; i < size ; i++) {
			while(j > 0 && pattern[i] != pattern[j]) {
				j = Pi[j - 1];
			}
			if ( pattern[i] == pattern[j] ) {
				Pi[i] = ++j;
			}
		}
		
		return Pi;
	}
	
	public static void doKMP(String target, String pattern) { // KMP 알고리즘 실행
		int[] Pi = getPi(pattern);
		
		char[] tarr = target.toCharArray();
		char[] parr = pattern.toCharArray();
		
		int tsize = target.length();
		int psize = pattern.length();
		int j = 0;
		
		for(int i = 0 ; i < tsize ; i++) {
			while(j > 0 && tarr[i] != parr[j]) {
				j = Pi[j - 1];
			}
			if ( tarr[i] == parr[j]) {
				if ( j == psize - 1) {
					System.out.println((i - psize + 2) + "번째에서 찾았습니다.");
					j = Pi[j];
				} else {
					j++;
				}
			}
		}
		
	}

}
