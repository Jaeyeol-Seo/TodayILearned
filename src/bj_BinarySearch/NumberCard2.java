package bj_BinarySearch;

//BOJ 10816
import java.util.Scanner;

public class NumberCard2 {

	public static int[] card = new int[20000001];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt();
			
			card[num + 10000000]++;
		}
		
		int m = sc.nextInt();
		
		for(int i = 0 ; i < m ; i++) {
			int key = sc.nextInt();
			
			System.out.print(card[key + 10000000] + " ");
		}
		
		//이분탐색 카테고리 문제지만 이분탐색을 쓰지 않았다....
	}

}
