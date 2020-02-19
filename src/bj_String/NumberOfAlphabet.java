package bj_String;

//BOJ 10808
import java.util.Scanner;

public class NumberOfAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] alphabet = new int[26];
		
		String s = sc.next();
		
		for(int i = 0 ; i < s.length() ; i++) {
			alphabet[(int)s.charAt(i) - 97]++;
		}
		
		for(int i : alphabet) {
			System.out.print(i + " ");
		}
	}

}
