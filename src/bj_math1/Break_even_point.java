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
			if(!(variable < price)) { // ���� ����� ���ݺ��� ũ�ų� ������ ���� ���ͺб��� ���� �� ����
				System.out.println(-1);
				return;
			}
			if(fixed + (variable * cnt) > price * cnt) {
				cnt++;
				continue;
			} else { 
				if (fixed + (variable * cnt) == price * cnt) {
					System.out.println(cnt + 1); // ������ �� �� �� �Ⱦƾ� ���� �߻�
					return;
				} else System.out.println(cnt); return; // �ƴϸ� �� ������ ���� �߻�
			}
		}
	}

}
