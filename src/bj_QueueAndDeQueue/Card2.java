package bj_QueueAndDeQueue;

//BOJ 2164
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Card2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			queue.offer(i);
		}
		
		while (queue.size() != 1) {
			queue.poll();
			
			queue.offer(queue.poll());
		}
		
		System.out.println(queue.peek());
	}

}
