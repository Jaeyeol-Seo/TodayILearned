package bj_Search;

//BOJ 1026
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Treasure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		Integer[] trg = new Integer[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++) {
			trg[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		Arrays.sort(trg, Collections.reverseOrder()); // 내림차순 정렬때는 객체 타입
		
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			sum += arr[i] * trg[i];
		}
		
		System.out.println(sum);
	}

}
