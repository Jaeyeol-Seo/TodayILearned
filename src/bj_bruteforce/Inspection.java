package bj_bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class Inspection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int tcase = sc.nextInt();

		int[] arr = new int[tcase];

		for (int i = 0; i < tcase; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		for (int j = 2; j < arr[arr.length - 1]; j++) {
			for (int i = 0; i < tcase - 1; i++) {
				if (arr[i] % j == arr[i + 1] % j) {
					if (i == tcase - 2) {
						sb.append(j + " ");
					}
					continue;
				} else break;
			}
		}
		System.out.println(sb);
	}

}
