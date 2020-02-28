package bj_Search;

import java.util.Scanner;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] tree = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			tree[i] = sc.nextInt();
		}
	}

}
