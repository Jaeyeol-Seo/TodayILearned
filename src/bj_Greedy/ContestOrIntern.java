package bj_Greedy;

//BOJ 2875
import java.util.Scanner;

public class ContestOrIntern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int female = sc.nextInt();
		int male = sc.nextInt();
		int intern = sc.nextInt();
		
		int teamcnt = 0;
		
		while ( female >= 2 && male >= 1 && female + male >= 3 + intern) {
			female -= 2;
			male -= 1;
			teamcnt++;
		}
		
		System.out.println(teamcnt);
	}

}
