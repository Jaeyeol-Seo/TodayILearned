package bj_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CoordinateSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int tcase = sc.nextInt();
		
		for(int i = 0 ; i < tcase ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			list.get(x).add(y);
		}
		
		
	}
}
