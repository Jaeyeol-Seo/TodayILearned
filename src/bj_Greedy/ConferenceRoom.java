package bj_Greedy;

//BOJ 1931
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ConferenceRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] conf = new int[n][2];
		
		for(int i = 0 ; i < n ; i++) {
			conf[i][0] = sc.nextInt();
			conf[i][1] = sc.nextInt();
		}
		
		Arrays.sort(conf, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
			
		});
		
		int cnt = 0;
		int end = -1;
		
		for(int i = 0 ; i < n ; i++) {
			if( conf[i][0] >= end) {
				end = conf[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
