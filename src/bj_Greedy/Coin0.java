package bj_Greedy;

//BOJ 11047
import java.util.Scanner;

public class Coin0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int coinnum = sc.nextInt();
		int money = sc.nextInt();
		
		int[] coinvalue = new int[coinnum];
		int cnt = 0;
		
		for(int i = 0 ; i < coinnum ; i++) {
			coinvalue[i] = sc.nextInt();
		}
		
		for(int i = coinnum - 1 ; i >= 0 ; i--) {
			if ( money < coinvalue[i] ) {
				continue;
			} else {
				cnt += (money / coinvalue[i]);
				money %= coinvalue[i]; 				
			}
		}
		
		System.out.println(cnt);
	}

}
