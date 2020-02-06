package bj_recursive;

//BOJ 1904
import java.util.Scanner;

public class Tile01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int[] tile = new int[1000001];
		
		tile[1] = 1;
		tile[2] = 2;
		
		for ( int i = 3 ; i < 1000001 ; i++) {
			tile[i] = (tile[i - 2] + tile[i - 1]) % 15746;
		}
		
		System.out.println(tile[num]);
	}
}
