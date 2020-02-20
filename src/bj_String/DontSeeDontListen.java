package bj_String;

//BOJ 1764
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DontSeeDontListen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Map<String, Integer> hs = new HashMap<>();
		
		int listen = sc.nextInt();
		int see = sc.nextInt();
		
		int cnt = 0;
		
		for(int i = 0 ; i < listen ; i++) { 
			String s = sc.next();
			hs.put(s, 0);
		}
		
		for(int i = 0 ; i < see ; i++) {
			String s = sc.next();
			if(hs.containsKey(s)) {
				hs.put(s, hs.get(s) + 1);
			}
		}
		
		TreeMap<String, Integer> tm = new TreeMap<>(hs);
		
		for(String i : tm.keySet()) {
			if(tm.get(i) != 0) {
				sb.append(i + System.lineSeparator());
				cnt++;
			}
		}
		
		System.out.println(cnt);
		System.out.println(sb);
	}

}
