package bj_Search;

//BOJ 1019
import java.util.Scanner;

public class BookPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] num = new int[10];

		int point = 1;
		int start = 1;
		
		while (start <= n) {
	        // 끝자리 9로 만들기
	        while (n % 10 != 9 && start <= n) {
	            cal(n, num, point);
	            n--;
	        }
	 
	        if (n < start) {
	            break;
	        }
	 
	        // 끝자리 0으로 만들기
	        while (start % 10 != 0 && start <= n) {
	            cal(start, num, point);
	            start++;
	        }
	 
	        start /= 10;
	        n /= 10;
	 
	        for (int i = 0; i < 10; i++) {
	            num[i] += (n - start + 1) * point;
	        }
	 
	        point *= 10;
	    }
	 
	    for (int i = 0; i < 10; i++) {
	        System.out.print(num[i] + " ");
	    }

	}
	
	public static void cal(int a, int[] b, int c) {
		while (a > 0) {
	        b[a % 10] += c;
	        a /= 10;
	    }
	}

}
