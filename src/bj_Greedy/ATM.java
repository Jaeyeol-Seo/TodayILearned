package bj_Greedy;

//BOJ 11399
import java.util.Arrays;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int usernum = sc.nextInt();
		
		int[] usetime = new int[usernum];
		
		for(int i = 0 ; i < usetime.length ; i++) {
			usetime[i] = sc.nextInt();
		}
		
		Arrays.sort(usetime);
		
		int timesum = 0;
		
		for(int i = 0 ; i < usetime.length ; i++) {
			for(int j = 0 ; j <= i ; j++) {
				timesum += usetime[i - j];
			}
		}
		
		System.out.println(timesum);
	}

}
