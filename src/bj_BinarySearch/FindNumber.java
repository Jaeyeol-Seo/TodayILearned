package bj_BinarySearch;

//BOJ 1920
import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {

	public static int[] arr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		Arrays.sort(arr);
		
		for(int i = 0 ; i < k ; i++) {
			int m = sc.nextInt();

			System.out.println(binarySearch(0, arr.length, m));
		}
	}
	
	public static int binarySearch(int start, int end, int key) {
		// Arrays 클래스 내부 이분 탐색 코드
		int low = start;
        int high = end - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return 1; // key found
        }
        return 0;  // key not found.
		
	}

}
