package bj_bruteforce;

//BOJ 7568
import java.util.Arrays;
import java.util.Scanner;

public class Dungchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int tcase = sc.nextInt();
		
		int human[][] = new int[tcase][2];
		int reward[] = new int[tcase];
		
		Arrays.fill(reward, 1);
		
		for(int i = 0 ; i < tcase ; i++) {
			human[i][0] = sc.nextInt();
			human[i][1] = sc.nextInt();
		}
		
		for(int i = 0 ; i < tcase ; i++) {
			for(int j = 0 ; j < tcase ; j++) {
				if ( human[i][0] < human[j][0] && human[i][1] < human[j][1]) {
					reward[i]++;
				}
			}
		}
		
		for(int i = 0 ; i < tcase ; i++) {
			System.out.print(reward[i] + " ");
		}
	}

}
