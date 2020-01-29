package bj_sort;

//BOJ 2108
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Statistics {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tcase = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<>();
		int[] arr = new int[8001];
		
		double sum = 0; // 산술평균 구하기 위한 합계
		double average = 0; // 산술평균
		int min = 4000;
		int max = -4000;
		int many = 0; // 최빈값
		
		for(int i = 0 ; i < tcase ; i++) {
			int num = Integer.parseInt(br.readLine()); 
			
			list.add(num);
			arr[num + 4000]++;
			
			sum += num;
			
			if ( min > num) {
				min = num;
			}
			if ( max < num) {
				max = num;
			}
		}
		
		int tempmax = 0;
		ArrayList<Integer> templist = new ArrayList<>();
		
		for(int i = 0 ; i < 8001 ; i++) {
			if ( arr[i] != 0 && arr[i] > tempmax ) {
				tempmax = arr[i];
			}
		}
		
		for(int i = 0 ; i < 8001 ; i++) {
			if ( arr[i] == tempmax ) {
				templist.add(i - 4000);
			}
		}
		
		if ( templist.size() < 2) {
			many = templist.get(0);
		} else {
			Collections.sort(templist);
			many = templist.get(1);
		}
		
		Collections.sort(list);
		
		average = Math.round(sum / tcase);
		
		bw.write(String.valueOf(Math.round(average)) + "\n");
		bw.write(String.valueOf(list.get((list.size() / 2)) + "\n"));
		bw.write(String.valueOf(many) + "\n");
		bw.write(String.valueOf(max - min));
		
		bw.close();
	}

}
