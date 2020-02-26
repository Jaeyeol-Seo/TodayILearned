package bj_DP;

//BOJ 11726
import java.util.Scanner;

public class Tiling2n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] tile = new int[1001];
		
		tile[1] = 1;
		tile[2] = 2;
		
		for (int i = 3; i < tile.length ; i++) {
			tile[i] = (tile[i - 1] + tile[i - 2]) % 10007;
		}
		
		System.out.println(tile[sc.nextInt()]);
	}

}
