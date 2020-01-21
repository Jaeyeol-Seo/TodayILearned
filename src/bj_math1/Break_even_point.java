package bj_math1;

// BOJ 1722
import java.util.Scanner;

public class Break_even_point {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long fixed = sc.nextInt();
		long variable = sc.nextInt();
		long price = sc.nextInt();
		
		long cnt = 1;
		
		while(true) {
			if(!(variable < price)) { // 가변 비용이 가격보다 크거나 같으면 절대 손익분기점 넘을 수 없다
				System.out.println(-1);
				return;
			}
			if(fixed + (variable * cnt) > price * cnt) {
				cnt++;
				continue;
			} else { 
				if (fixed + (variable * cnt) == price * cnt) {
					System.out.println(cnt + 1); // 같으면 한 대 더 팔아야 이익 발생
					return;
				} else System.out.println(cnt); return; // 아니면 그 때부터 이익 발생
			}
		}
	}

}
