package bj_sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		int[][] node = new int[tcase][2];
		
		for(int i = 0 ; i < tcase ; i++) {
			node[i][0] = sc.nextInt();
			node[i][1] = sc.nextInt();
		}
		
		Arrays.sort(node, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				
				return Integer.compare(o1[1], o2[1]);
			}
			
		});
		
		for(int i = 0 ; i < node.length ; i++) {
			System.out.println(node[i][0] + " " + node[i][1]);
		}
	}
}
