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
			
			String stri = String.valueOf(i); // ���� ���� ���ڹ迭ȭ
			
			for(int j = 0 ; j < stri.length(); j++) {
				answer += (int) (stri.charAt(j) - 48); // ���� �� �ڸ��� ���� ��ģ ��
			}
			
			if ( answer + i == num ) { // ��ģ ���̶� ���� ���ڸ� ���ؼ� �Է°��� ������ ���� ���� ���
				System.out.println(i);
				return;
			}
			
		} System.out.println(0); // ���� ��� for�� �� ���� 0 ���
		
	}

}
