package bj_bruteforce;

import java.util.Scanner;

public class Repaint_chessboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] colornum = new int[2];
		
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		int ground = width * height;
		
		String[] gnd = new String[width];
		
		for(int i = 0 ; i < width ; i++) {
			gnd[i] = sc.next();
		}
		
		for(int i = 0 ; i < width ; i++) {
			for(int j = 0 ; j < height ; j++) {
				if (gnd[i].charAt(j) == 'B') {
					colornum[0]++;
				} else colornum[1]++;
			}
		}
		
		int max = Math.max(colornum[0], colornum[1]);
		
		int temp = max - (ground / 2);
		
		System.out.println(colornum[1]);
	}

}
