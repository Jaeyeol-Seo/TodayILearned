package bj_Greedy;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int money = sc.nextInt();
		
		int change = 1000 - money;
		
		int[] arr = {500, 100, 50, 10, 5, 1};
		
		int cnt = 0;
		
		for(int i : arr) {
			if(change < i) {
				continue;
			}
			cnt += change / i;
			change %= i; 
		}
		
		System.out.println(cnt);
	}

}
