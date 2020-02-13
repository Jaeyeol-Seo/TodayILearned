package bj_BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class CuttingTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] tree = new long[n];

		long limit = sc.nextInt();

		for (int i = 0; i < tree.length; i++) {
			tree[i] = sc.nextLong();
		}

		Arrays.sort(tree);

		long max = tree[tree.length - 1];
		long min = 0;
		long mid = 0;

		while (max >= min) {
			long cnt = 0;
			mid = (max + min) / 2;

			for (long i : tree) {
				cnt += i - mid > 0 ? i - mid : 0;
			}

			if (cnt >= limit) {
				min = mid + 1;
			} else
				max = mid - 1;

		}

		System.out.println(max);
	}
}
