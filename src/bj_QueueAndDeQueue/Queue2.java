package bj_QueueAndDeQueue;

//BOJ 18258
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String nstr = br.readLine();
		int n = Integer.parseInt(nstr);
		
		int back = 0;
		
		for(int i = 0 ; i < n ; i++) {
			String s = br.readLine();
			
			String[] arr = s.split(" ");
			
			if ( arr[0].equals("push") ) {
				back = Integer.parseInt(arr[1]);
				queue.offer(back);
			} else if ( arr[0].equals("pop")) {
				if (queue.isEmpty()) {
					sb.append("-1" + System.lineSeparator());
				} else sb.append(queue.poll() + System.lineSeparator());
			} else if ( arr[0].equals("size")) {
				sb.append(queue.size() + System.lineSeparator());
			} else if ( arr[0].equals("front")) {
				if (queue.isEmpty() ) {
					sb.append("-1" + System.lineSeparator());
				}
				else sb.append(queue.peek() + System.lineSeparator());
			} else if ( arr[0].equals("back")) {
				if (queue.isEmpty()) {
					sb.append("-1" + System.lineSeparator());
				}
				else sb.append(back + System.lineSeparator());
			} else if ( arr[0].equals("empty")) {
				if (queue.isEmpty() ) {
					sb.append("1" + System.lineSeparator());
				}
				else sb.append("0" + System.lineSeparator());
			}
		}
		System.out.println(sb);
		
	}

}
