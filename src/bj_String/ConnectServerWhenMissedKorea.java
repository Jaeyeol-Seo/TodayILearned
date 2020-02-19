package bj_String;

//BOJ 9996
import java.util.Scanner;

public class ConnectServerWhenMissedKorea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int tcase = sc.nextInt();
		String tctext = sc.next();
		
		int index = 0;
		char[] tctarr = tctext.toCharArray();
		
		for(int i = 0 ; i < tctarr.length ; i++) {
			if ( tctarr[i] == '*' ) {
				index = i;
				break;
			}
		}
		
		String prefix = tctext.substring(0, index);
		String suffix = tctext.substring(index + 1, tctext.length());
		
		for(int i = 0 ; i < tcase ; i++) {
			String target = sc.next();
			if(target.length() < prefix.length() + suffix.length()) { // 대상의 길이가 두 패턴 길이의 합보다 작으면 안된다. 중복일 경우도 있기 때문에
				sb.append("NE" + System.lineSeparator());
				continue;
			}
			if(target.substring(0, index).equals(prefix)) {
				if (target.substring(target.length() - suffix.length()).equals(suffix)) {
					sb.append("DA" + System.lineSeparator());					
				} else sb.append("NE" + System.lineSeparator());
			} else sb.append("NE" + System.lineSeparator());
		}
		System.out.println(sb);
	}

}
