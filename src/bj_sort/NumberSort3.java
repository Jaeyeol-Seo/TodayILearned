package bj_sort;

//BOJ 10989
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class NumberSort3 { // 

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
 
        for (int i = 1; i < 10001; i++) {
            if (arr[i] > 0) {
                for (int j = 0; j < arr[i]; j++) {
                    bw.write(String.valueOf(i) + "\n");
                }
            }
        }
        br.close();
        bw.close();
	}

}
