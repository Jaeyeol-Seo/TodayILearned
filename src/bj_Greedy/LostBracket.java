package bj_Greedy;

//BOJ 1541
import java.util.Scanner;

public class LostBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		String[] arr = s.split("\\-");
		
		int min = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			int temp = parsing(arr[i]);
			if ( i == 0 ) {
				temp *= -1;
			}
			min += temp;
		}
		
		System.out.println(min);
	}
	
	public static int parsing(String s) {
		String[] arr = s.split("\\+");
		
		int temp = 0; 
		for(int i = 0 ; i < arr.length ; i++) {
			temp -= Integer.parseInt(arr[i]);
		}
		
		return temp;
	}

}
