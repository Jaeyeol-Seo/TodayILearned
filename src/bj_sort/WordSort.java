package bj_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class WordSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		ArrayList<String> list = new ArrayList<>();
		
		for(int i = 0 ; i < tcase ; i++) {
			String s = sc.next();
			if(!list.contains(s)) {
				list.add(s);
			}
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if ( o1.length() > o2.length()) {
					return 1;
				} else if ( o1.length() < o2.length()) {
					return -1;
				}
				else return o1.compareTo(o2);
			}
			
		});
		
		for(String i : list) {
			System.out.println(i);
		}
	}

}
