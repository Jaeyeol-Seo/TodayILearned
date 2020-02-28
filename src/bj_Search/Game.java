package bj_Search;

//BOJ 1072
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();
		long Y = sc.nextLong();

		int now = (int) ((Y * 100) / X);

		int min = 0;
		int max = 1000000001;
		int mid = 0;

		int temp = 0;

		if (now >= 99) {
			System.out.println(-1);
			return;
		} else {
			while (min <= max) {
				mid = (min + max) / 2;

				temp = (int) ((Y + mid) * 100 / (X + mid));

				if (temp > now) {
					max = mid - 1;
				} else {
					min = mid + 1;
				}

			}
		}
		
		System.out.println(min);
	}

}
