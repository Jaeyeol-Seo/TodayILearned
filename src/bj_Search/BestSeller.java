package bj_Search;

//BOJ 1302
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class BestSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		
		HashMap<String, Integer> hs = new HashMap<>();
		
		for(int i = 0 ; i < N ; i++) {
			String s = sc.next();
			if(!hs.containsKey(s)) {
				hs.put(s, 1);
			} else {
				hs.put(s, hs.get(s) + 1);
			}
		}
		TreeMap<String, Integer> tm = new TreeMap<>(hs);
		ArrayList<Integer> list = new ArrayList<>(tm.values());
		Collections.sort(list);
		
		for(String i : tm.keySet()) {
			if(tm.get(i) == list.get(list.size() - 1)) {
				System.out.println(i);
				return;
			}
		}
		
	}

}
