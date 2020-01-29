package bj_sort;

//BOJ 2751
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class NumberSort2 {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tcase = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0 ; i < tcase ; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(arr);
		
		for(int i : arr) {
			bw.write(i + "\n");
		}
		bw.flush();
		bw.close();
	}

}
