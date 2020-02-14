package bj_BinarySearch;

//BOJ 2110
import java.util.Arrays;
import java.util.Scanner;

public class SetupAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	    int c = sc.nextInt();
	    int[] array = new int[n];
	 
	    for (int i = 0; i < n; i++) {
	        array[i] = sc.nextInt();
	    }
	 
	    Arrays.sort(array);
	 
	    int left = 1; // ������ �ּ� �Ÿ�
	    int right = array[n - 1] - array[0]; // ������ �ִ� �Ÿ�
	    int d = 0;
	    int ans = 0;
	 
	    while (left <= right) {
	        int mid = (left + right) / 2; // ����
	        int start = array[0];
	        int cnt = 1;
	 
	        // ����(d) �� �������� ������ ��ġ
	        for (int i = 1; i < n; i++) {
	            d = array[i] - start;
	            if (mid <= d) {
	                ++cnt;
	                start = array[i];
	            }
	        }
	 
	        if (cnt >= c) {
	            // �������� ���� ������ => ���� ������
	            ans = mid;
	            left = mid + 1;
	        } else {
	            // �����Ⱑ �� ��ġ�Ǿ���Ѵ�. => ���� ������
	            right = mid - 1;
	        }
	    }
	    System.out.println(ans);
	}

}