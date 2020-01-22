package bj_bruteforce;

//BOJ 2231
import java.util.Scanner;

public class Dividesum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			int answer = 0;
			
			String stri = String.valueOf(i); // 비교할 수를 문자배열화
			
			for(int j = 0 ; j < stri.length(); j++) {
				answer += (int) (stri.charAt(j) - 48); // 숫자 각 자리의 수를 합친 값
			}
			
			if ( answer + i == num ) { // 합친 값이랑 기존 숫자를 더해서 입력값이 나오면 기존 숫자 출력
				System.out.println(i);
				return;
			}
			
		} System.out.println(0); // 없는 경우 for문 다 돌고 0 출력
		
	}

}
