package bj_DivideAndConquer;

//BOJ 1780
import java.util.Scanner;

public class NumOfPaper {

	public static int[][] arr;
	public static int n;
	public static int[] cnt = new int[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		arr = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		solve(0, 0, n);
		
		for(int a : cnt) {
			System.out.println(a);
		}
		
	}
	
	public static void solve(int row, int col, int n) {
		if ( checkPaper(row, col, n)) {
			cnt[arr[row][col] + 1]++;
		} else {
			int len = n / 3;
			
			for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    solve(row + len * i, col + len * j, len); // 일정 값으로 증가하기 때문에 for문 활용
                }
            }
		}
	}
	
	
	public static boolean checkPaper(int row, int col, int n) {
		int std = arr[row][col];
        for (int i = row; i < row + n; i++) {
            for (int j = col; j < col + n; j++) {
                if (std != arr[i][j]) // 배열의 첫 값이랑만 비교해서 다른 게 있으면 false 리턴. 오호라?
                    return false;
            }
        }
        return true;
	}

}
