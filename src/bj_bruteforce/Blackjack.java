package bj_bruteforce;

//BOJ 2798
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int cardnum = sc.nextInt();
		int limitnum = sc.nextInt();

		int[] cardvalue = new int[cardnum];

		int valuesum = 0;
		int answer = 0;

		for (int i = 0; i < cardnum; i++) {
			cardvalue[i] = sc.nextInt();
		}

		for (int i = 0; i < cardnum - 2; i++) {
			for (int j = i + 1; j < cardnum - 1; j++) {
				for (int k = j + 1; k < cardnum; k++) {
					valuesum = cardvalue[i] + cardvalue[j] + cardvalue[k];
					if (valuesum <= limitnum) {
						answer = Math.max(answer, valuesum);
					}
					if (answer == limitnum) {
						System.out.println(answer);
						return;
					} 
				}
			}
		}
		System.out.println(answer);
	}

}
