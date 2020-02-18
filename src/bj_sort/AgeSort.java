package bj_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AgeSort {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		String[][] arr = new String[tcase][2];
		
		for(int i = 0 ; i < tcase ; i++) {
			arr[i][0] = sc.next();
			arr[i][1] = sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				// TODO Auto-generated method stub
				return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
			}
			
		});
		
		for(String[] i : arr) {
			System.out.println(i[0] + " " + i[1]);
		}
	}

}
